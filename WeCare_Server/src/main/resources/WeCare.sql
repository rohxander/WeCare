DROP DATABASE IF EXISTS WECARE;
CREATE DATABASE WECARE;
USE WECARE;


CREATE TABLE usertable(
	user_id VARCHAR(50),
	name VARCHAR(50) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    date_of_birth DATE NOT NULL,
	password VARCHAR(70) NOT NULL,
	mobile_number VARCHAR(10) NOT NULL UNIQUE,
	email VARCHAR (70) NOT NULL,
    pincode INT NOT NULL,
    city VARCHAR(20),
    state VARCHAR(30),
    country VARCHAR(30),
	constraint primary key ( user_id )
);

CREATE TABLE coachtable(
	coach_id VARCHAR(50),
	name VARCHAR(50) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    date_of_birth DATE NOT NULL,
	password VARCHAR(70) NOT NULL,
	mobile_number VARCHAR(10) NOT NULL UNIQUE,
	speciality VARCHAR(45) NOT NULL
);

INSERT INTO usertable
(`user_id`,`name`,`gender`,`date_of_birth`,`password`,`mobile_number`,`email`,`pincode`,`city`,`state`,`country`)							
VALUES
('U18320209221001','Abhishek','M','1995-11-28','12345','9464927770','abhishek.verma30@Infosys.com','160020','Chandigarh','Punjab','India');

INSERT INTO `wecare`.`coachtable`
(`coach_id`,`name`,`gender`,`date_of_birth`,`password`,`mobile_number`,`speciality`)
VALUES
('LC24320201946101','Neha','F','1999-03-07','12345','9876543210','Anxiety Specialist');
