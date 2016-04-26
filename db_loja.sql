-- MySQL dump 10.13  Distrib 5.7.11, for Win64 (x86_64)
--
-- Host: localhost    Database: db_loja
-- ------------------------------------------------------
-- Server version	5.7.11-log

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
-- Table structure for table `tb_cliente`
--

DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_cliente` (
  `COD_CLI` int(11) NOT NULL AUTO_INCREMENT,
  `NOME_CLI` varchar(255) NOT NULL,
  `DTA_NASC_CLI` date NOT NULL,
  `CPF_CLI` varchar(15) NOT NULL,
  `RG_CLI` varchar(15) DEFAULT NULL,
  `TEL_CLI` varchar(25) NOT NULL,
  `ENDERECO_CLI` varchar(255) DEFAULT NULL,
  `BAIRRO_CLI` varchar(255) DEFAULT NULL,
  `CIDADE_CLI` varchar(255) DEFAULT NULL,
  `CEP_CLI` varchar(12) DEFAULT NULL,
  `ESTADO_CLI` varchar(2) DEFAULT NULL,
  `OBS_CLI` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`COD_CLI`),
  UNIQUE KEY `CPF_CLI` (`CPF_CLI`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cliente`
--

LOCK TABLES `tb_cliente` WRITE;
/*!40000 ALTER TABLE `tb_cliente` DISABLE KEYS */;
INSERT INTO `tb_cliente` VALUES (78,'wagner','2009-02-01','190.623.368-33','76.867.868-7','(76)8767-8687','','','','     -   ','AC',''),(80,'Teste','2010-05-01','413.235.468-77','','(43)9167-1350','','','','','',''),(81,'Teste','2010-05-01','413.235.468-78','','(43)9167-1350','','','','','',''),(86,'Teste','2010-05-01','413.235.468-80','','(43)9167-1350','','','','','',''),(88,'kskjsd','1822-02-28','888.888.888-88','88.888.888-8','(43)0000-0000','asuaslkj','ksjfasd','ronaldo','86300-000','PR',''),(90,'asasdfaf','2016-02-29','777.777.777-77','88.888.888-8','(88)8888-8888','asfdadfa','asdads','asdfaa','88888-888','AC',''),(94,'Teste','2010-05-01','413.235.468-81','','(43)9167-1350','','','','','',''),(96,'WAGNER DE SOUZA CHAVES','2016-04-01','413.235.468-71','76.876.768-6','(89)7888-9798','','','','     -   ','AC',''),(98,'MARCELO MINORU','2016-01-01','456.064.210-97','87.868.678-6','(76)7867-6876','','','','     -   ','AC',''),(99,'JUAN FONSECA','2016-02-01','861.751.225-34','09.099.090-9','(08)9098-9009','','','','     -   ','AC',''),(100,'MATHEUS MOLLON','2016-01-01','999.999.999-99','87.887.889-7','(89)7987-9879','','','','     -   ','AC',''),(103,'WAGNER DE SOUZA CHAVES','2016-01-01','171.698.857-86','87.897.987-9','(76)7868-7678','','','','     -   ','AC',''),(105,'Teste','2010-05-01','412.235.468-81','','(43)9167-1350','','','','','',''),(107,'RENATO GATTI','2012-07-01','666.666.666-66','89.809.890-8','(98)7897-9879','','','','     -   ','AC',''),(111,'WANDERLEI MALAQUIAS','2016-01-01','111.111.111-11','98.789.798-7','(76)7868-7686','','','','     -   ','AC',''),(116,'Teste','2010-05-01','412.235.468-82','','(43)9167-1350','','','','','','');
/*!40000 ALTER TABLE `tb_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_itens_venda`
--

DROP TABLE IF EXISTS `tb_itens_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_itens_venda` (
  `COD_ITEM` int(11) NOT NULL AUTO_INCREMENT,
  `QTD_COMPRA_ITEM` int(11) unsigned DEFAULT '1',
  `COD_VENDA` int(11) NOT NULL,
  `COD_PROD` int(11) NOT NULL,
  PRIMARY KEY (`COD_ITEM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_itens_venda`
--

LOCK TABLES `tb_itens_venda` WRITE;
/*!40000 ALTER TABLE `tb_itens_venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_itens_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_produto`
--

DROP TABLE IF EXISTS `tb_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_produto` (
  `COD_PROD` varchar(255) NOT NULL,
  `NOME_PROD` varchar(255) NOT NULL,
  `MARCA_PROD` varchar(255) NOT NULL,
  `PRECO_PROD` float unsigned DEFAULT NULL,
  `QTD_PROD` int(11) unsigned DEFAULT '0',
  `GARANTIA_PROD` int(11) unsigned DEFAULT '0',
  PRIMARY KEY (`COD_PROD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_produto`
--

LOCK TABLES `tb_produto` WRITE;
/*!40000 ALTER TABLE `tb_produto` DISABLE KEYS */;
INSERT INTO `tb_produto` VALUES ('1','GUITARRA XLS','XLS',100,6,12),('10098','TECLADO','LG',650,3,6),('10099','TESTE3','TESTE4',0,0,0),('10100','TESTE3','TESTE4',0,0,0),('123456','PIANO','TWM',4500.99,2,36),('2','Bateria','XYZ',78.65,1,2),('3','Saxofone','ExM',80.99,1,2),('4','VIOLAO','XTAL',80.99,1,2),('5','Gaita','XLS',1078.33,1,2),('6','VIOLA','XX2',580.99,10,18),('638288877','TROMPETE','MUSITEC',350,4,6),('678','MICROFONE','UHG',50,12,4),('73423','VIOLONCELO','XLS',870.9,6,9),('786786897','CAIXA DE SOM TURBO','TURBO',800,1,0),('9878978','PIANO','MUSITEC',4000.56,1,36);
/*!40000 ALTER TABLE `tb_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_venda`
--

DROP TABLE IF EXISTS `tb_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_venda` (
  `COD_VENDA` int(11) NOT NULL AUTO_INCREMENT,
  `DTA_VENDA` datetime NOT NULL,
  `COD_CLI` int(11) NOT NULL,
  PRIMARY KEY (`COD_VENDA`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_venda`
--

LOCK TABLES `tb_venda` WRITE;
/*!40000 ALTER TABLE `tb_venda` DISABLE KEYS */;
INSERT INTO `tb_venda` VALUES (1,'2016-04-01 11:06:37',0),(4,'2016-04-05 11:07:10',0);
/*!40000 ALTER TABLE `tb_venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-26 18:38:14
