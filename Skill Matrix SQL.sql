/*
SQLyog Ultimate v8.82 
MySQL - 5.1.45-community : Database - oes
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`oes` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `oes`;

/*Table structure for table `contact_feed` */

DROP TABLE IF EXISTS `contact_feed`;

CREATE TABLE `contact_feed` (
  `name` varchar(25) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `message` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contact_feed` */

insert  into `contact_feed`(`name`,`email`,`message`) values ('Dev Prakash Singh','devsingh98011@gmail.com','This is a very good website'),('Ragini','ragini@gmail.com','Excellent website'),('Nandini Pandey','nandini@gmail.com','Cool\r\n');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `u_name` varchar(50) NOT NULL,
  `pswd` varchar(30) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`u_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`u_name`,`pswd`,`type`) values ('admin','admin','Admin'),('dev','98011','Student');

/*Table structure for table `ques_mstr` */

DROP TABLE IF EXISTS `ques_mstr`;

CREATE TABLE `ques_mstr` (
  `ques_id` int(100) NOT NULL AUTO_INCREMENT,
  `que` varchar(600) DEFAULT NULL,
  `op1` varchar(100) DEFAULT NULL,
  `op2` varchar(100) DEFAULT NULL,
  `op3` varchar(100) DEFAULT NULL,
  `op4` varchar(100) DEFAULT NULL,
  `ans` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ques_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

/*Data for the table `ques_mstr` */

insert  into `ques_mstr`(`ques_id`,`que`,`op1`,`op2`,`op3`,`op4`,`ans`) values (1,'Which of the following is not a Java feature?','Object-Oriented','Portable','Dynamic','Compiler-free','Compiler-free'),(2,'What is the default value of a boolean variable in Java?','true','false','0','null','false'),(3,'What is the size of an int in Java?','8 bits','16 bits','32 bits','64 bits','32 bits'),(4,'Which method is used to start a thread in Java?','run()','execute()','start()','init()','start()'),(5,'What is the extension of a Java bytecode file?','.java','.class','.byte','.exe','.class'),(6,'Which keyword is used to inherit a class in Java?','implement','extends','inherits','override','extends'),(7,'What is the output of 10 + \"20\" in Java?','30','1020','Error','None of the above','1020'),(8,'Which of these is a marker interface?','Cloneable','Runnable','Serializable','Both A and C','Both A and C'),(9,'Which of the following is not a valid access modifier in Java?','public','private','protected','internal','internal'),(10,'How is an abstract class declared in Java?','abstract class MyClass','class abstract MyClass','MyClass abstract class','None of the above','abstract class MyClass'),(11,'Which operator is used to compare two values in Java?','=','==','===','equals()','=='),(12,'What is the return type of the hashCode() method in Java?','int','float','String','double','int'),(13,'Which of the following is used to handle exceptions in Java?','try-catch','if-else','for loop','while loop','try-catch'),(14,'Which class is the superclass of all classes in Java?','String','Object','Class','System','Object'),(15,'Which keyword is used to create a constant in Java?','static','final','const','immutable','final'),(16,'Which of the following is not part of Java\'s Collection Framework?','ArrayList','HashMap','Hashtable','BufferedReader','BufferedReader'),(17,'What is the default value of an int array element in Java?','0','null','undefined','garbage value','0'),(18,'Which method is called to free resources before an object is destroyed?','finalize()','destructor()','dispose()','close()','finalize()'),(19,'Which keyword is used to prevent a class from being extended?','static','sealed','final','const','final'),(20,'What does the \"this\" keyword refer to in Java?','The superclass object','The current class object','A static object','None of the above','The current class object'),(21,'Which of these loops is guaranteed to execute at least once?','for loop','while loop','do-while loop','None of the above','do-while loop'),(22,'How can you achieve runtime polymorphism in Java?','Method Overloading','Method Overriding','Using static methods','Using final methods','Method Overriding'),(23,'Which class in Java is immutable?','StringBuffer','String','StringBuilder','None of the above','String'),(24,'Which method is used to read a single character from the console in Java?','read()','getChar()','readChar()','getchar()','read()'),(25,'Which of the following is not a wrapper class in Java?','Integer','Double','Character','Floatable','Floatable');

/*Table structure for table `result_mstr` */

DROP TABLE IF EXISTS `result_mstr`;

CREATE TABLE `result_mstr` (
  `user_id` varchar(100) NOT NULL,
  `exam_date` date DEFAULT NULL,
  `score` int(100) DEFAULT NULL,
  `t_attempt` int(100) DEFAULT NULL,
  `c_answer` int(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `result_mstr` */

insert  into `result_mstr`(`user_id`,`exam_date`,`score`,`t_attempt`,`c_answer`) values ('dev','2025-01-16',20,25,20);

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `u_name` varchar(100) NOT NULL,
  `pswd` varchar(30) DEFAULT NULL,
  `d_reg` varchar(100) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `quali1` varchar(20) DEFAULT NULL,
  `quali2` varchar(30) DEFAULT NULL,
  `addr` varchar(150) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `contact` decimal(10,0) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`u_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_info` */

insert  into `user_info`(`u_name`,`pswd`,`d_reg`,`dob`,`gender`,`quali1`,`quali2`,`addr`,`city`,`contact`,`email`) values ('dev','dev98011','2025-01-16','2005-06-30','Male','BCA','NULL','1/253 jankipuram','Lucknow','9838011971','devsingh98011@gmail.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
