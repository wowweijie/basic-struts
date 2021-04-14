CREATE DATABASE UsersDB;
CREATE TABLE `UsersDB`.`Login` (
   `Username` VARCHAR( 10 ) NOT NULL ,
   `Password` VARCHAR( 10 ) NOT NULL ,
   PRIMARY KEY ( `Username` )
) ENGINE = InnoDB;

INSERT INTO `UsersDB`.`Login` (`Username`, `Password`)
VALUES ('wangye', 'wy123'),('weijie', 'wj456'),('Jordan', 'jt789');
