#-- 3.1.4.1
DROP TRIGGER IF EXISTS insert_trip_log;
DELIMITER $
CREATE TRIGGER insert_trip_log BEFORE INSERT  ON trip
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', "TRIP", session_use());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_trip_log;
DELIMITER $
CREATE TRIGGER update_trip_log BEFORE UPDATE ON trip
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'TRIP', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_trip_log;
DELIMITER $
CREATE TRIGGER delete_trip_log BEFORE DELETE ON trip
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'TRIP', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS insert_reservation_log;
DELIMITER $
CREATE TRIGGER insert_reservation_log BEFORE INSERT  ON reservation
FOR EACH ROW
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', 'RESERVATION', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_reservation_log;
DELIMITER $
CREATE TRIGGER update_reservation_log BEFORE UPDATE  ON reservation
FOR EACH ROW
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'RESERVATION', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_reservation_log;
DELIMITER $
CREATE TRIGGER delete_reservation_log BEFORE DELETE ON reservation
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'RESERVATION', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS insert_event_log;
DELIMITER $
CREATE TRIGGER insert_event_log BEFORE INSERT  ON event
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', 'EVENT',session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_event_log;
DELIMITER $
CREATE TRIGGER update_event_log BEFORE UPDATE  ON event
FOR EACH ROW
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'EVENT', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_event_log;
DELIMITER $
CREATE TRIGGER delete_event_log BEFORE DELETE ON event
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'EVENT', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS insert_travel_to_log;
DELIMITER $
CREATE TRIGGER insert_travel_to_log BEFORE INSERT  ON travel_to
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', 'TRAVEL_TO', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_travel_to_log;
DELIMITER $
CREATE TRIGGER update_travel_to_log BEFORE UPDATE  ON travel_to
FOR EACH ROW
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'TRAVEL_TO', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_travel_to_log;
DELIMITER $
CREATE TRIGGER delete_travel_to_log BEFORE DELETE ON travel_to
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'TRAVEL_TO', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS insert_destination_log;
DELIMITER $
CREATE TRIGGER insert_destination_log BEFORE INSERT  ON destination
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', 'DESTINATION', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_destination_log;
DELIMITER $
CREATE TRIGGER update_destination_log BEFORE UPDATE  ON destination
FOR EACH ROW
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'DESTINATION', session_user());
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_destination_log;
DELIMITER $
CREATE TRIGGER delete_destination_log BEFORE DELETE ON destination
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'DESTINATION', session_user());
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
