CREATE INDEX payInAdv_lname_fname_offerTrId_indx ON reservation_offers(pay_in_adv, lastname, firstname, offer_tr_id);

#-- 3.1.3.1

DROP PROCEDURE IF EXISTS new_driver;
DELIMITER $
 
CREATE PROCEDURE new_driver (IN id CHAR(10), IN name VARCHAR(20), IN surname VARCHAR(20), IN salary FLOAT(7,2), IN license_type VARCHAR(20), IN route VARCHAR(20), IN experience TINYINT(4))
BEGIN 
	DECLARE branch_code VARCHAR(10);

	SELECT COUNT(*) AS 'cnt', br_code INTO branch_code FROM branch
        INNER JOIN worker ON branch.br_code = worker.wrk_br_code 
        INNER JOIN driver ON worker.wrk_AT = driver.drv_AT
        GROUP BY br_code 
        ORDER BY cnt ASC;


	INSERT INTO worker 
	(wrk_AT, wrk_name, wrk_lname, wrk_salary, wrk_br_code) 
	VALUES (id, name, surname, salary, @branch_code);

	INSERT INTO driver (drv_AT, drv_license, drv_rout, drv_experience) VALUES (id, license_type, route, experience);

END $
DELIMITER ;

#-- 3.1.3.2

DROP PROCEDURE IF EXISTS sceduled_trips;

DELIMITER $
CREATE PROCEDURE sceduled_trips (IN br_code INT, IN d1 DATETIME, IN d2 DATETIME)
BEGIN
    SELECT trip.tr_departure, trip.tr_return, trip.tr_cost, trip.tr_maxseats, 
           (trip.tr_maxseats - COUNT(reservation.res_tr_id)) AS remaining_seats,
           COUNT(reservation.res_tr_id) AS reservations,
           guide.wrk_name, guide.wrk_lname, 
           driver.wrk_name, driver.wrk_lname
    FROM trip
    LEFT JOIN reservation ON trip.tr_id = reservation.res_tr_id
    LEFT JOIN worker AS guide ON trip.tr_gui_AT = guide.wrk_AT
    LEFT JOIN worker AS driver ON trip.tr_drv_AT = driver.wrk_AT
    WHERE trip.tr_br_code = br_code
    AND trip.tr_departure BETWEEN d1 AND d2 
    GROUP BY trip.tr_id, trip.tr_departure, trip.tr_return;
END$
DELIMITER ;

#-- 3.1.3.3

DROP PROCEDURE IF EXISTS delete_admin;
DELIMITER $
CREATE PROCEDURE delete_admin (IN name VARCHAR(20), IN surname VARCHAR(20)) 
BEGIN
  DECLARE worker_id INT;

  label_exit: BEGIN
    SELECT wrk_AT INTO worker_id
    FROM worker
    WHERE wrk_name = name AND wrk_lname = surname;

    IF EXISTS (SELECT 1 FROM _admin WHERE adm_AT = worker_id AND adm_type = "ADMINISTRATIVE") THEN
      SELECT "Cant Delete Administrative";
      LEAVE label_exit;
    END IF; 

    DELETE FROM _admin
    WHERE adm_AT = worker_id AND (adm_type = "LOGISTICS" OR adm_type = "ACCOUNTING");

    DELETE FROM worker 
    WHERE wrk_AT = worker_id; 
  END;

END $

DELIMITER ;

#-- 3.1.3.4.a

DROP PROCEDURE IF EXISTS pay_in_advance;
DELIMITER $

CREATE PROCEDURE pay_in_advance(IN rangeA INT, IN rangeB INT)
BEGIN 
	SELECT lastname AS "Last Name",firstname AS "First Name" FROM reservation_offers WHERE pay_in_adv BETWEEN rangeA AND rangeB;
END $
DELIMITER ;

#-- Example of calling the procedure
CALL pay_in_advance(100,150);


#-- 3.1.3.4.b

DROP PROCEDURE IF EXISTS find_lastname;
DELIMITER $

CREATE PROCEDURE find_lastname(IN search_lname VARCHAR(20))
BEGIN

	SELECT lastname AS "Last Name",firstname AS "First Name",offer_tr_id AS "TripID Offer" FROM reservation_offers WHERE lastname LIKE search_lname;

	# We check if there are more than 1 same lastnames in the table reservation_offers 
        IF (SELECT count(lastname) FROM reservation_offers WHERE lastname LIKE search_lname) > 1 THEN 
		SELECT count(lastname) AS "Same Last Name in each offer",offer_tr_id AS "TripID Offer" FROM reservation_offers WHERE lastname LIKE search_lname GROUP BY offer_tr_id;
	END IF;
END $

DELIMITER ;

#-- Example of calling the procedure
CALL find_lastname("Walter");
