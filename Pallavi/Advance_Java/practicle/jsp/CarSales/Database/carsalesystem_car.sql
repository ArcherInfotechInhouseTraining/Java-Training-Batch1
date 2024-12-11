CREATE DATABASE  IF NOT EXISTS `carsalesystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `carsalesystem`;
-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: carsalesystem
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `description` text,
  `year` varchar(4) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `model_id` int DEFAULT NULL,
  `member_id` int DEFAULT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `is_sold` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `model_id` (`model_id`),
  KEY `member_id` (`member_id`),
  CONSTRAINT `car_ibfk_1` FOREIGN KEY (`model_id`) REFERENCES `model` (`id`),
  CONSTRAINT `car_ibfk_2` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'mercedes','Luxirious','2022',40000000.00,1,1,'images/2.jpg',1),(2,'Toyota','Reliable','2023',3000000.00,4,2,'images/fortuner.jpg',1),(3,'Rolls Royce','Royal','2023',50000000.00,7,2,'images/rollsroyce.jpg',1),(4,'Lamborghini-Gallardo','sports','2020',34000000.00,8,1,'images/gallardo.jpg',0),(5,'kia sonet ','1500cc, max speed 180kmph','2023',2000000.00,10,2,'images/KIA_Sonet_KV_1920.jpg',1),(6,'Porsche 911 GT','Sports','2022',50000000.00,11,1,'images/911.jpg',0),(7,'Volswagon ','Virtus GT','2022',2000000.00,12,4,'images/VIRTUS.jpg',1),(8,'Mercedes C-class','Luxirious ','2023',60000000.00,17,1,'images/c class.jpg',1),(9,'Rolls Royce','Royal car ','2023',40000000.00,18,2,'images/cullinan.jpg',0),(10,'Mercedes Maybach GLS 600 ','Luxirious Royal Car','2023',40000000.00,19,1,'images/gls600.jpg',1),(11,'Ferrari SF90','Sporty','2024',8000000.00,20,3,'images/sf90.jpg',1),(12,'Buggati Chiron','Max Speed 480kmph','2023',8000000.00,21,4,'images/chiron.jpg',0),(13,'Aston martin','sports car','2023',5000000.00,22,4,'images/as.jpg',1),(14,'BMW X7','SUV','2023',40000000.00,23,4,'images/X7.jpg',1);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-11 21:01:40
