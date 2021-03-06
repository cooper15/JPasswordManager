CREATE DATABASE  IF NOT EXISTS `Password` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `Password`;
-- MySQL dump 10.13  Distrib 5.5.40, for debian-linux-gnu (i686)
--
-- Host: 127.0.0.1    Database: Password
-- ------------------------------------------------------
-- Server version	5.5.40-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Passwords`
--

DROP TABLE IF EXISTS `Passwords`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Passwords` (
  `idPasswords` int(11) NOT NULL AUTO_INCREMENT,
  `nom_Usuario` varchar(45) NOT NULL,
  `pass_Sitio` varchar(45) NOT NULL,
  `nom_Sitio` varchar(45) NOT NULL,
  `url_Sitio` varchar(45) NOT NULL,
  `fecha_vencimiento` date NOT NULL,
  PRIMARY KEY (`idPasswords`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Passwords`
--

LOCK TABLES `Passwords` WRITE;
/*!40000 ALTER TABLE `Passwords` DISABLE KEYS */;
INSERT INTO `Passwords` VALUES (20,'cooper15','cam','sitio','www.sitio.com','2014-10-15'),(27,'victor','Ki8sPF3Mxb/zAVghyKAwyQ==','misitio','misitio.com','2014-11-08'),(28,'manuel','c1vMRbMSrtUpFYc5qpOLfzqlahrmVtZQ','BancoCR','www.bancocrfi.com','2014-11-14');
/*!40000 ALTER TABLE `Passwords` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-10-27 21:58:18
