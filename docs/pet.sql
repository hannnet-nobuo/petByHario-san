-- MySQL dump 10.13  Distrib 5.7.13, for Win64 (x86_64)
--
-- Host: localhost    Database: petbooking
-- ------------------------------------------------------
-- Server version	5.7.13-log

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CUSTOMER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CUSTOMER_NM` varchar(50) NOT NULL,
  `CUSTOMER_KN` varchar(50) NOT NULL,
  `SEX` char(1) DEFAULT NULL,
  `POST_CD` char(7) DEFAULT NULL,
  `ADDRESS1` varchar(50) DEFAULT NULL,
  `ADDRESS2` varchar(50) DEFAULT NULL,
  `ADDRESS3` varchar(50) DEFAULT NULL,
  `ADDRESS4` varchar(50) DEFAULT NULL,
  `TEL` char(13) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `BIRTH_YMD` date DEFAULT NULL,
  `INS_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPD_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`CUSTOMER_ID`),
  UNIQUE KEY `インデックス 2` (`CUSTOMER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'顧客','こきゃく','M','2770897','トランプタワー','天安門','ベルサイユ宮殿','バッキンガム宮殿','1345678','example','2017-03-01','2017-03-01 13:15:53','2017-03-01 13:15:53');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `ITEM_CD` char(10) NOT NULL,
  `ITEM_NM` varchar(50) NOT NULL,
  `ITEM_ATTRIBUTE` int(11) NOT NULL,
  `ITEM_COST` decimal(10,0) NOT NULL,
  `ITEM_PRICE` decimal(10,0) NOT NULL,
  `INS_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPD_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ITEM_CD`),
  UNIQUE KEY `インデックス 2` (`ITEM_CD`),
  KEY `FK_ITEM_ITEM_ATTRIBUTE` (`ITEM_ATTRIBUTE`),
  CONSTRAINT `FK_ITEM_ITEM_ATTRIBUTE` FOREIGN KEY (`ITEM_ATTRIBUTE`) REFERENCES `item_attribute` (`ITEM_ATTRIBUTE_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_attribute`
--

DROP TABLE IF EXISTS `item_attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_attribute` (
  `ITEM_ATTRIBUTE_NO` int(11) NOT NULL,
  `ITEM_ATTRIBUTE_NM` varchar(50) NOT NULL,
  PRIMARY KEY (`ITEM_ATTRIBUTE_NO`),
  UNIQUE KEY `インデックス 2` (`ITEM_ATTRIBUTE_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_attribute`
--

LOCK TABLES `item_attribute` WRITE;
/*!40000 ALTER TABLE `item_attribute` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_attribute` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserve`
--

DROP TABLE IF EXISTS `reserve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reserve` (
  `RESERVE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `START_YMD` date NOT NULL,
  `END_YMD` date NOT NULL,
  `CHECK_IN_YMD` date DEFAULT NULL,
  `CHECK_OUT_YMD` date DEFAULT NULL,
  `SELL_NO` int(11) NOT NULL,
  `INS_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPD_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`RESERVE_ID`),
  UNIQUE KEY `インデックス 2` (`RESERVE_ID`),
  KEY `FK_RESERVE_SELL_NO` (`SELL_NO`),
  CONSTRAINT `FK_RESERVE_SELL_NO` FOREIGN KEY (`SELL_NO`) REFERENCES `sell` (`SELL_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserve`
--

LOCK TABLES `reserve` WRITE;
/*!40000 ALTER TABLE `reserve` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sell`
--

DROP TABLE IF EXISTS `sell`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sell` (
  `SELL_NO` int(11) NOT NULL,
  `SELL_YMD` date NOT NULL,
  `CUSTOMER_ID` int(11) NOT NULL,
  `ITEM_CD` char(10) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `PRICE` decimal(10,0) NOT NULL,
  `INCLUDING_TAX` decimal(10,0) NOT NULL,
  `TAX` decimal(10,0) NOT NULL,
  `INS_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPD_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`SELL_NO`),
  UNIQUE KEY `インデックス 2` (`SELL_NO`),
  KEY `FK_SELL_CUSTOMER_ID` (`CUSTOMER_ID`),
  KEY `FK_SELL_ITEM_CD` (`ITEM_CD`),
  CONSTRAINT `FK_SELL_CUSTOMER_ID` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `customer` (`CUSTOMER_ID`),
  CONSTRAINT `FK_SELL_ITEM_CD` FOREIGN KEY (`ITEM_CD`) REFERENCES `item` (`ITEM_CD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sell`
--

LOCK TABLES `sell` WRITE;
/*!40000 ALTER TABLE `sell` DISABLE KEYS */;
/*!40000 ALTER TABLE `sell` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NM` varchar(50) NOT NULL,
  `USER_PW` varchar(50) NOT NULL,
  `INS_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPD_YMD` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `インデックス 2` (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'テスト','testpass','2000-01-01 00:00:00','2000-01-01 00:00:00');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-01 13:38:45
