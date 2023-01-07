#-- 3.1.3.1

DROP PROCEDURE IF EXISTS new_driver;
DELIMITER $
 
CREATE PROCEDURE new_driver (in id VARCHAR(10),in name VARCHAR(20),in surname VARCHAR(20),in salary FLOAT(7,2), in license_type ENUM , in route ENUM , in experience TINYINT(4))
BEGIN
	DECLARE branch INT ;
	
	SELECT branch = MIN(branch) FROM 
	(SELECT br_code,COUNT(*) AS DRIVERS FROM branch INNER JOIN worker ON br_code=wrk_br_code join driver on wrk_AT=drv_AT ORDER BY COUNT(*) DESC);
	
	INSERT INTO worker (id, name, surname, salary) 
    VALUES (@id, @name, @surname, @salary);
	
	INSERT INTO driver (id, license_type, route,Experience,branchid) 
    VALUES (@id, @license_type, @route,@Experience,@branchid);

END $

#-- 3.1.3.2

DROP PROCEDURE IF EXISTS sceduled_trips;
DELIMITER $

CREATE PROCEDURE sceduled_trips (IN branchcode INT(10),IN date1 DATETIME, IN date2 DATETIME)
BEGIN
	
	DECLARE branch_id INT;
	DECLARE departure DATETIME;
	DECLARE tripid INT;
	DECLARE guideAT INT;
	DECLARE driverAT INT;
	
	
	SELECT tr_br_code INTO branch_id FROM trip ;
	
	
	IF (branchcode = branch_id )THEN
	
	SELECT tr_departure INTO departure FROM  trip WHERE tr_br_code=branch_id;
	SELECT tr_gui_AT INTO guideAT FROM trip WHERE tr_br_code=branch_id;
	SELECT tr_drv_AT INTO driverAT FROM trip WHERE tr_br_code=branch_id;
	SELECT tr_id INTO tripid FROM trip WHERE tr_br_code=branch_id;
	
	 IF (date1 < departure AND date2 > departure ) THEN
		SELECT * FROM trip WHERE tr_br_code = branchcode ;
		SELECT wrk_name AND wrk_lname AS QUIDE FROM worker WHERE wrk_AT = guideAT ;
		SELECT wrk_name AND wrk_lname AS DRIVER FROM  worker WHERE wrk_AT = driverAT;
		SELECT COUNT(*) AS RESERVATIONS FROM reservations WHERE res_tr_id = tripid;
		END IF;
	END IF;


END$


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
