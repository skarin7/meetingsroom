DROP TABLE IF EXISTS `employee_personal`;
CREATE TABLE IF NOT EXISTS `employee_personal` (
  `employee_id` varchar(100) NOT NULL,
  `employee_name` varchar(255) DEFAULT NULL,
  `title` varchar(10) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `age` TINYINT DEFAULT 5,
  `marital_status` varchar(10) DEFAULT NULL,
  `lives_in` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
