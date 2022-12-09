CREATE DATABASE travel_agency;
USE travel_agency;

CREATE TABLE trip(

	tr_id INT(11) NOT NULL,
	tr_departure DATETIME NOT NULL, 
	tr_return DATETIME NOT NULL,
	tr_maxseats TINYINT(4) NOT NULL,
	tr_cost FLOAT(7,2) NOT NULL,
	tr_br_code INT(11) NOT NULL,
	tr_gui_AT CHAR(10) DEFAULT 'unknown' NOT NULL,
	tr_drv_AT CHAR(10) DEFAULT 'unknown' NOT NULL,
       	
	PRIMARY KEY(tr_id)

) engine=InnoDB;

CREATE TABLE destination(

	dst_id INT(11) NOT NULL,
	dst_name VARCHAR(50) DEFAULT 'unknown' NOT NULL,
	dst_descr TEXT,
	dst_rtype ENUM('LOCAL','ABROAD') NOT NULL,
	dst_language VARCHAR(30) DEFAULT 'unknown' NOT NULL,
	dst_location INT(11) NOT NULL,

	PRIMARY KEY(dst_id)  

) engine=InnoDB; 

CREATE TABLE reservation(

	res_tr_id INT(11),
	res_seatnum TINYINT(4) NOT NULL,
	res_name VARCHAR(20) DEFAULT 'unknown' NOT NULL,
	res_lname VARCHAR(20) DEFAULT 'unknown' NOT NULL,
	res_isadult ENUM('ADULT','MINOR'),

	PRIMARY KEY(res_tr_id,res_seatnum),

	CONSTRAINT RESTRID FOREIGN KEY (res_tr_id) REFERENCES trip(tr_id)
	ON DELETE CASCADE ON UPDATE CASCADE 

) engine=InnoDB;

CREATE TABLE travel_to(

	to_tr_id INT(11),
	to_dst_id INT(11),
	to_arrival DATETIME,
	to_departure DATETIME,

	PRIMARY KEY(to_tr_id,to_dst_id),	

	CONSTRAINT TRIPID FOREIGN KEY (to_tr_id) REFERENCES trip(tr_id) 
        ON DELETE CASCADE ON UPDATE CASCADE,

	CONSTRAINT TRDESTID FOREIGN KEY (to_dst_id) REFERENCES destination(dst_id)
	ON DELETE CASCADE ON UPDATE CASCADE  

) engine=InnoDB;




