#-- 3.1.4.1
DROP TRIGGER IF EXISTS log;
DELIMITER $

CREATE TRIGGER log AFTER INSERT ON trip
FOR EACH ROW
BEGIN
	INSERT INTO log(event_type, changes_date, username) VALUES (
		CASE 
			WHEN INSERTING THEN 'INSERT'
			WHEN UPDATING THEN 'UPDATE'
			ELSE 'DELETE'
		END,
		OLD.id,
		USER
	);
END$
DELIMITER ;

DELIMITER $
CREATE TRIGGER log AFTER INSERT ON reservation
FOR EACH ROW
BEGIN
	INSERT INTO log(event_type, changes_date, username) VALUES (
		CASE 
			WHEN INSERTING THEN 'INSERT'
			WHEN UPDATING THEN 'UPDATE'
			ELSE 'DELETE'
		END,
		OLD.id,
		USER
	);
END$
DELIMITER ;

DELIMITER $
CREATE TRIGGER log AFTER INSERT ON event
FOR EACH ROW
BEGIN
	INSERT INTO log(event_type, changes_date, username) VALUES (
		CASE 
			WHEN INSERTING THEN 'INSERT'
			WHEN UPDATING THEN 'UPDATE'
			ELSE 'DELETE'
		END,
		OLD.id,
		USER
	);
END$
DELIMITER ;

DELIMITER $
CREATE TRIGGER log AFTER INSERT ON travel_to
FOR EACH ROW
BEGIN
	INSERT INTO log(event_type, changes_date, username) VALUES (
		CASE 
			WHEN INSERTING THEN 'INSERT'
			WHEN UPDATING THEN 'UPDATE'
			ELSE 'DELETE'
		END,
		OLD.id,
		USER
	);
END$
DELIMITER ;

DELIMITER $
CREATE TRIGGER log AFTER INSERT ON destination
FOR EACH ROW
BEGIN
	INSERT INTO log(event_type, changes_date, username) VALUES (
		CASE 
			WHEN INSERTING THEN 'INSERT'
			WHEN UPDATING THEN 'UPDATE'
			ELSE 'DELETE'
		END,
		OLD.id,
		USER
	);
END$
DELIMITER ;

#-- 3.1.4.2

DROP TRIGGER IF EXISTS stop_update;
DELIMITER $

CREATE TRIGGER stop_update BEFORE UPDATE ON trip
FOR EACH ROW
BEGIN
	
	IF (SELECT COUNT(*) FROM reservation WHERE res_tr_id = NEW.tr_id) > 0 THEN
		
		IF NEW.tr_departure <> old.tr_departure THEN
                	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'You cannot update the date of departure';
        	END IF; 

        	IF NEW.tr_return <> old.tr_return THEN
                	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'You cannot update the date of return';
        	END IF; 

        	IF NEW.tr_cost <> old.tr_cost THEN
                	SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'You cannot update the cost of the trip';
        	END IF; 
	
	END IF;
END $

DELIMITER ;

#-- 3.1.4.3

DROP TRIGGER IF EXISTS prevent_salary_lowering;
DELIMITER $ 

CREATE TRIGGER prevent_salary_lowering 
 BEFORE UPDATE ON worker
 FOR EACH ROW
 BEGIN
   IF NEW.wrk_salary < OLD.wrk_salary THEN
     SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Cannot lower salary value';
   END IF;
 END$

DELIMITER ;
