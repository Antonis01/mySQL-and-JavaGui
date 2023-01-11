#-- 3.1.4.1
DROP TRIGGER IF EXISTS insert_trip_log;
DELIMITER $
CREATE TRIGGER insert_trip_log BEFORE INSERT  ON trip
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', "TRIP", "user name");
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_trip_log;
DELIMITER $
CREATE TRIGGER update_trip_log AFTER UPDATE ON trip
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'TRIP', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_trip_log;
DELIMITER $
CREATE TRIGGER delete_trip_log AFTER DELETE ON trip
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'TRIP', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS insert_reservation_log;
DELIMITER $
CREATE TRIGGER insert_reservation_log AFTER INSERT  ON reservation
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', 'RESERVATION', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_reservation_log;
DELIMITER $
CREATE TRIGGER update_reservation_log AFTER UPDATE  ON reservation
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'RESERVATION', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_reservation_log;
DELIMITER $
CREATE TRIGGER delete_reservation_log AFTER DELETE ON reservation
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'RESERVATION', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS insert_event_log;
DELIMITER $
CREATE TRIGGER insert_event_log AFTER INSERT  ON event
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', 'EVENT', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_event_log;
DELIMITER $
CREATE TRIGGER update_event_log AFTER UPDATE  ON event
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'EVENT', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_event_log;
DELIMITER $
CREATE TRIGGER delete_event_log AFTER DELETE ON event
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'EVENT', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS insert_travel_to_log;
DELIMITER $
CREATE TRIGGER insert_travel_to_log AFTER INSERT  ON travel_to
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', 'TRAVEL_TO', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_travel_to_log;
DELIMITER $
CREATE TRIGGER update_travel_to_log AFTER UPDATE  ON travel_to
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'TRAVEL_TO', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_travel_to_log;
DELIMITER $
CREATE TRIGGER delete_travel_to_log AFTER DELETE ON travel_to
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'TRAVEL_TO', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS insert_destination_log;
DELIMITER $
CREATE TRIGGER insert_destination_log AFTER INSERT  ON destination
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('INSERT', 'DESTINATION', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS update_destination_log;
DELIMITER $
CREATE TRIGGER update_destination_log AFTER UPDATE  ON destination
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('UPDATE', 'DESTINATION', NEW.user);
END$
DELIMITER ;

DROP TRIGGER IF EXISTS delete_destination_log;
DELIMITER $
CREATE TRIGGER delete_destination_log AFTER DELETE ON destination
FOR EACH ROW  
BEGIN
  INSERT INTO log (event_type, table_name, username)
  VALUES ('DELETE', 'DESTINATION', NEW.user);
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
