#-- 3.1.3.3

CREATE PROCEDURE delete_admin (IN name VARCHAR(20), IN surname VARCHAR(20)) 
BEGIN
  DECLARE worker_id INT;

  label_exit: BEGIN
    SELECT `wrk_AT` INTO worker_id
    FROM `worker`
    WHERE `wrk_name` = name AND `wrk_lname` = surname;

    IF EXISTS (SELECT 1 FROM _admin WHERE `adm_AT` = worker_id AND `adm_type` = 'ADMINISTRATIVE') THEN
      SELECT "Can't Delete Administrative";
      LEAVE label_exit;
    END IF; 

    DELETE FROM `_admin`
    WHERE `adm_AT` = worker_id AND (`adm_type` = 'LOGISTICS' OR `adm_type` = 'ACCOUNTING');

    DELETE FROM `worker` 
    WHERE `wrk_AT` = worker_id; 
  END;

END

#-- 3.1.3.4.a

CREATE INDEX payInAdv_lname_fname_offerTrId_indx ON reservation_offers(pay_in_adv, lastname, firstname, offer_tr_id);

DROP PROCEDURE IF EXISTS pay_in_advance;
DELIMITER $

CREATE PROCEDURE pay_in_advance(IN rangeA INT, IN rangeB INT)
BEGIN 
	SELECT lastname AS 'Last Name',firstname AS 'First Name' FROM reservation_offers WHERE pay_in_adv BETWEEN rangeA AND rangeB;
END $
DELIMITER ;

#-- Example of calling the procedure
CALL pay_in_advance(100,150);


#-- 3.1.3.4.b

DROP PROCEDURE IF EXISTS find_lastname;
DELIMITER $

CREATE PROCEDURE find_lastname(IN search_lname VARCHAR(20))
BEGIN

	SELECT lastname AS 'Last Name',firstname AS 'First Name',offer_tr_id AS 'TripID Offer' FROM reservation_offers WHERE lastname LIKE search_lname;

	# We check if there are more than 1 same lastnames in the table reservation_offers 
        IF (SELECT count(lastname) FROM reservation_offers WHERE lastname LIKE search_lname) > 1 THEN 
		SELECT count(lastname) AS 'Same Last Name in each offer',offer_tr_id AS 'TripID Offer' FROM reservation_offers WHERE lastname LIKE search_lname GROUP BY offer_tr_id;
	END IF;
END $

DELIMITER ;

#-- Example of calling the procedure
CALL find_lastname("Walter");
