-- -----------------------------------------------------
-- Schema full-stack-ecommerce
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `hospital-system`;

CREATE SCHEMA `hospital-system`;
USE `hospital-system` ;

-- -----------------------------------------------------
-- Table `hospital-system`.`patient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hospital-system`.`patient` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(255) DEFAULT NULL,
  `last_name` VARCHAR(255) DEFAULT NULL,
  `email` VARCHAR(255) DEFAULT NULL,
  `aadhar` VARCHAR(255) DEFAULT NULL,
  `pancard` VARCHAR(255) DEFAULT NULL,
  `status` varChar(10) DEFAULT NULL,
  
  PRIMARY KEY (`id`)) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;


-- -----------------------------------------------------
-- Add sample data
-- -----------------------------------------------------

INSERT INTO patient (first_name, last_name, email, aadhar, pancard, status)
VALUES ('John', 'Doe', 'john@gmail.com', '1234123456785678', 'BSDFFTYU', 'POSITIVE');

INSERT INTO patient (first_name, last_name, email, aadhar, pancard, status)
VALUES ('Mary', 'Jane', 'mary@gmail.com', '2345123456785678', 'ASDFFSF', 'NEGATIVE');

INSERT INTO patient (first_name, last_name, email, aadhar, pancard, status)
VALUES ('Peter', 'Parker', 'peter@gmail.com', '1234123456785632', 'BSDFFSF', 'POSITIVE');

INSERT INTO patient (first_name, last_name, email, aadhar, pancard, status)
VALUES ('Sandra', 'Lopez', 'sandra@gmail.com', '1234456756785678', 'BTYUFSF', 'POSITIVE');

INSERT INTO patient (first_name, last_name, email, aadhar, pancard, status)
VALUES ('Puneet', 'Gowda', 'puneet@gmail.com', '1234765456785678', 'BGHRFFSF', 'NEGATIVE');
