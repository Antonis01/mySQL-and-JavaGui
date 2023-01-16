CREATE DATABASE travel_agency;
USE travel_agency;


CREATE TABLE branch (

        br_code INT(11) NOT NULL AUTO_INCREMENT,
        br_street VARCHAR(30) DEFAULT 'unknown' NOT NULL,
        br_num INT(4) NOT NULL,
        br_city VARCHAR(30) DEFAULT 'unknown' NOT NULL,

        UNIQUE (br_code)

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE phones (

        ph_br_code INT(11),
        ph_number CHAR(10) DEFAULT 'unknown' NOT NULL,

        PRIMARY KEY (ph_br_code, ph_number),

        CONSTRAINT BRANCHPH FOREIGN KEY (ph_br_code) REFERENCES branch (br_code)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE worker (

        wrk_AT CHAR(10) DEFAULT 'unknown' NOT NULL,
        wrk_name VARCHAR(20) DEFAULT 'unknown' NOT NULL,
        wrk_lname VARCHAR(20) DEFAULT 'unknown' NOT NULL,
        wrk_salary FLOAT (7,2) NOT NULL,
        wrk_br_code INT(11),

        UNIQUE (wrk_AT),

        CONSTRAINT BRANCHWRK FOREIGN KEY (wrk_br_code) REFERENCES branch (br_code)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;

CREATE TABLE it(
		
	it_at CHAR(10) DEFAULT 'unknown' NOT NULL,
	passwords VARCHAR(10) DEFAULT 'password' NOT NULL,
	start_date DATETIME NOT NULL,
	end_date DATETIME NOT NULL,
		
	UNIQUE (it_at),
		
	CONSTRAINT WRKIT FOREIGN KEY (it_at) REFERENCES worker (wrk_AT) 
        ON DELETE CASCADE ON UPDATE CASCADE


) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE _admin (

        adm_AT CHAR(10),
        adm_type ENUM('LOGISTICS', 'ADMINISTRATIVE', 'ACCOUNTING') NOT NULL,
        adm_diploma VARCHAR(200) DEFAULT 'unknown' NOT NULL,

        PRIMARY KEY (adm_AT),

        CONSTRAINT ADMWRK FOREIGN KEY (adm_AT) REFERENCES worker (wrk_AT)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE manages (

        mng_adm_AT CHAR(10),
        mng_br_code INT(11),

        PRIMARY KEY (mng_adm_AT, mng_br_code),

        CONSTRAINT ADMMNGRAT FOREIGN KEY (mng_adm_AT) REFERENCES _admin (adm_AT)
        ON DELETE CASCADE ON UPDATE CASCADE,

        CONSTRAINT BRANCHMNGCODE FOREIGN KEY (mng_br_code) REFERENCES branch (br_code)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE guide (

        gui_AT CHAR(10),
        gui_CV TEXT ,

        PRIMARY KEY (gui_AT),

        CONSTRAINT GUIWRK FOREIGN KEY (gui_AT) REFERENCES worker (wrk_AT)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE languages (

        lng_gui_AT CHAR(10),
        lng_language VARCHAR(30) DEFAULT 'unknown' NOT NULL,

        PRIMARY KEY (lng_gui_AT, lng_language),

        CONSTRAINT GUILNG FOREIGN KEY (lng_gui_AT) REFERENCES guide (gui_AT)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE driver (

        drv_AT CHAR(10), 
        drv_license ENUM ('A','B','C','D') NOT NULL,
        drv_rout ENUM('LOCAL','ABROAD') NOT NULL,
        drv_experience TINYINT(4) NOT NULL,

        PRIMARY KEY(drv_AT),

        CONSTRAINT DRVWRKAT FOREIGN KEY (drv_AT) REFERENCES worker(wrk_AT)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE trip(

        tr_id INT(11) NOT NULL AUTO_INCREMENT,
        tr_departure DATETIME NOT NULL,
        tr_return DATETIME NOT NULL,
        tr_maxseats TINYINT(4) NOT NULL,
        tr_cost FLOAT(7,2) NOT NULL,
        tr_br_code INT(11),
        tr_gui_AT CHAR(10),
        tr_drv_AT CHAR(10),

        UNIQUE (tr_id, tr_departure, tr_return),

        CONSTRAINT TRBRCODE FOREIGN KEY(tr_br_code) REFERENCES branch(br_code)
        ON DELETE CASCADE ON UPDATE CASCADE,

        CONSTRAINT TRGUIAT FOREIGN KEY(tr_gui_AT) REFERENCES guide(gui_AT)
        ON DELETE CASCADE ON UPDATE CASCADE,

        CONSTRAINT TRDRVAT FOREIGN KEY(tr_drv_AT) REFERENCES driver(drv_AT)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE event (

        ev_tr_id INT(11),
        ev_start DATETIME NOT NULL,
        ev_end DATETIME NOT NULL,
        ev_desc TEXT,

        PRIMARY KEY(ev_tr_id, ev_start),

        CONSTRAINT EVTRIPID FOREIGN KEY (ev_tr_id) REFERENCES trip(tr_id)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE destination(

        dst_id INT(11) NOT NULL AUTO_INCREMENT,
        dst_name VARCHAR(50) DEFAULT 'unknown' NOT NULL,
        dst_descr TEXT,
        dst_rtype ENUM('LOCAL','ABROAD') NOT NULL, 
        dst_language VARCHAR(30) DEFAULT 'unknown' NOT NULL,
        dst_location INT(11),

        UNIQUE (dst_id),

        CONSTRAINT DSTLOC FOREIGN KEY (dst_location) REFERENCES destination(dst_id)
        ON DELETE SET NULL ON UPDATE SET NULL 

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE travel_to(

        to_tr_id INT(11),
        to_dst_id INT(11),
        to_arrival DATETIME NOT NULL,
        to_departure DATETIME NOT NULL,

        PRIMARY KEY(to_tr_id,to_dst_id),

        CONSTRAINT TRIPID FOREIGN KEY (to_tr_id) REFERENCES trip(tr_id)
        ON DELETE CASCADE ON UPDATE CASCADE,

        CONSTRAINT TRDESTID FOREIGN KEY (to_dst_id) REFERENCES destination(dst_id)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE reservation(

        res_tr_id INT(11),
        res_seatnum TINYINT(4) NOT NULL,
        res_name VARCHAR(20) DEFAULT 'unknown' NOT NULL,
        res_lname VARCHAR(20) DEFAULT 'unknown' NOT NULL,
        res_isadult ENUM('ADULT','MINOR') NOT NULL,

        UNIQUE (res_tr_id,res_seatnum),

        CONSTRAINT RESTRID FOREIGN KEY (res_tr_id) REFERENCES trip(tr_id)
        ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE offers(

	offer_tr_id INT(11) NOT NULL,
	offer_begins DATE NOT NULL,
	offer_ends DATE NOT NULL,
	cost_per_person FLOAT(7,2) NOT NULL,
	dst_id INT(11),

	UNIQUE (offer_tr_id),

	CONSTRAINT OFFDSTID FOREIGN KEY (dst_id) REFERENCES destination(dst_id)
	ON DELETE CASCADE ON UPDATE CASCADE 

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;


CREATE TABLE reservation_offers(
	
	res_off_tr_id INT(11) NOT NULL,
	lastname VARCHAR(20) DEFAULT 'unknown' NOT NULL,
	firstname VARCHAR(20) DEFAULT 'unknown' NOT NULL,
	offer_tr_id INT(11),
	pay_in_adv FLOAT (7,2) NOT NULL,

	UNIQUE (res_off_tr_id),

	CONSTRAINT RESOFFTRID FOREIGN KEY (offer_tr_id) REFERENCES offers(offer_tr_id)
	ON DELETE CASCADE ON UPDATE CASCADE 

) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;

CREATE TABLE log(

	event_type VARCHAR(24),
	table_name VARCHAR(50), 
	username VARCHAR (20) NOT NULL,

    	CONSTRAINT LOGUSER FOREIGN KEY (username) REFERENCES worker (wrk_lname)
	ON DELETE CASCADE ON UPDATE CASCADE 
) ENGINE = InnoDB CHARACTER SET greek COLLATE greek_general_ci;

