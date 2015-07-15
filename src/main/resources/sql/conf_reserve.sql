
--create DB schema 
CREATE DATABASE reserve_conf CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE USER 'pramati'@'%' IDENTIFIED by 'pramati123';
GRANT ALL PRIVILEGES ON reserve_conf.* TO 'pramati'@'%' WITH GRANT OPTION;
CREATE USER 'pramati'@'localhost' IDENTIFIED by 'pramati123';
GRANT ALL PRIVILEGES ON reserve_conf.* TO 'pramati'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;


DROP TABLE IF EXISTS `meeting_details`;
CREATE TABLE IF NOT EXISTS `meeting_details` (
  `meeting_id` varchar(255) NOT NULL,
  `conf_room_id` INT(10) NOT NULL,
  `reserved_by_email` varchar(50) NOT NULL,
  `reserved_by_firstname` varchar(50) DEFAULT NULL,
  `reserved_by_lastname` varchar(50) DEFAULT NULL,
  `meeting_date` DATE NOT  NULL,
  `start_time` varchar(5) NOT NULL,
  `end_time` varchar(5) NOT NULL,
  `meeting_subject` varchar(255) DEFAULT NULL,
  `meeting_body` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`meeting_id`),
  UNIQUE KEY `meeting_id` (`meeting_id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `conf_room_details`;
CREATE TABLE IF NOT EXISTS `conf_room_details` (
  `conf_room_id` INT(10) NOT NULL,
  `conf_room_name` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL,
  PRIMARY KEY (`conf_room_id`),
  CONSTRAINT `FK317B2346BF197` FOREIGN KEY (`conf_room_id`) REFERENCES `meeting_details` (`conf_room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `participant_details`;
CREATE TABLE IF NOT EXISTS `participant_details` (
 `meeting_id` varchar(255) NOT NULL,
  `email_id` varchar(50) NOT NULL,
  `is_optional` char(1) DEFAULT NULL
  CONSTRAINT `FK317B14366BF197` FOREIGN KEY (`meeting_id`) REFERENCES `meeting_details` (`meeting_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



