-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springbootu298c503
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `springbootu298c503`
--

/*!40000 DROP DATABASE IF EXISTS `springbootu298c503`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springbootu298c503` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springbootu298c503`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshi`
--

DROP TABLE IF EXISTS `jiaoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshigonghao` varchar(200) DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhicheng` varchar(200) DEFAULT NULL COMMENT '职称',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `pquestion` varchar(200) DEFAULT NULL COMMENT '密保问题',
  `panswer` varchar(200) DEFAULT NULL COMMENT '密保答案',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jiaoshigonghao` (`jiaoshigonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='教师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshi`
--

LOCK TABLES `jiaoshi` WRITE;
/*!40000 ALTER TABLE `jiaoshi` DISABLE KEYS */;
INSERT INTO `jiaoshi` VALUES (21,'2024-03-19 05:32:38','教师工号1','教师姓名1','123456','学院1','男','职称1','13823888881','密保问题1','密保答案1'),(22,'2024-03-19 05:32:38','教师工号2','教师姓名2','123456','学院2','男','职称2','13823888882','密保问题2','密保答案2'),(23,'2024-03-19 05:32:38','教师工号3','教师姓名3','123456','学院3','男','职称3','13823888883','密保问题3','密保答案3'),(24,'2024-03-19 05:32:38','教师工号4','教师姓名4','123456','学院4','男','职称4','13823888884','密保问题4','密保答案4'),(25,'2024-03-19 05:32:38','教师工号5','教师姓名5','123456','学院5','男','职称5','13823888885','密保问题5','密保答案5'),(26,'2024-03-19 05:32:38','教师工号6','教师姓名6','123456','学院6','男','职称6','13823888886','密保问题6','密保答案6'),(27,'2024-03-19 05:32:38','教师工号7','教师姓名7','123456','学院7','男','职称7','13823888887','密保问题7','密保答案7'),(28,'2024-03-19 05:32:38','教师工号8','教师姓名8','123456','学院8','男','职称8','13823888888','密保问题8','密保答案8');
/*!40000 ALTER TABLE `jiaoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshibaoxiu`
--

DROP TABLE IF EXISTS `jiaoshibaoxiu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshibaoxiu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshimingcheng` varchar(200) DEFAULT NULL COMMENT '教室名称',
  `baoxiuriqi` datetime DEFAULT NULL COMMENT '报修日期',
  `weixiuzhuangtai` varchar(200) DEFAULT NULL COMMENT '维修状态',
  `jiaoshigonghao` varchar(200) DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `guzhangmiaoshu` longtext COMMENT '故障描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='教室报修';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshibaoxiu`
--

LOCK TABLES `jiaoshibaoxiu` WRITE;
/*!40000 ALTER TABLE `jiaoshibaoxiu` DISABLE KEYS */;
INSERT INTO `jiaoshibaoxiu` VALUES (51,'2024-03-19 05:32:38','教室名称1','2024-03-19 13:32:38','已维修','教师工号1','教师姓名1','故障描述1'),(52,'2024-03-19 05:32:38','教室名称2','2024-03-19 13:32:38','已维修','教师工号2','教师姓名2','故障描述2'),(53,'2024-03-19 05:32:38','教室名称3','2024-03-19 13:32:38','已维修','教师工号3','教师姓名3','故障描述3'),(54,'2024-03-19 05:32:38','教室名称4','2024-03-19 13:32:38','已维修','教师工号4','教师姓名4','故障描述4'),(55,'2024-03-19 05:32:38','教室名称5','2024-03-19 13:32:38','已维修','教师工号5','教师姓名5','故障描述5'),(56,'2024-03-19 05:32:38','教室名称6','2024-03-19 13:32:38','已维修','教师工号6','教师姓名6','故障描述6'),(57,'2024-03-19 05:32:38','教室名称7','2024-03-19 13:32:38','已维修','教师工号7','教师姓名7','故障描述7'),(58,'2024-03-19 05:32:38','教室名称8','2024-03-19 13:32:38','已维修','教师工号8','教师姓名8','故障描述8');
/*!40000 ALTER TABLE `jiaoshibaoxiu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshimingcheng`
--

DROP TABLE IF EXISTS `jiaoshimingcheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshimingcheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshimingcheng` varchar(200) DEFAULT NULL COMMENT '教室名称',
  `rongnarenshu` varchar(200) DEFAULT NULL COMMENT '容纳人数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='教室名称';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshimingcheng`
--

LOCK TABLES `jiaoshimingcheng` WRITE;
/*!40000 ALTER TABLE `jiaoshimingcheng` DISABLE KEYS */;
INSERT INTO `jiaoshimingcheng` VALUES (81,'2024-03-19 05:32:38','教室名称1','容纳人数1'),(82,'2024-03-19 05:32:38','教室名称2','容纳人数2'),(83,'2024-03-19 05:32:38','教室名称3','容纳人数3'),(84,'2024-03-19 05:32:38','教室名称4','容纳人数4'),(85,'2024-03-19 05:32:38','教室名称5','容纳人数5'),(86,'2024-03-19 05:32:38','教室名称6','容纳人数6'),(87,'2024-03-19 05:32:38','教室名称7','容纳人数7'),(88,'2024-03-19 05:32:38','教室名称8','容纳人数8');
/*!40000 ALTER TABLE `jiaoshimingcheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshishenqing`
--

DROP TABLE IF EXISTS `jiaoshishenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshishenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshimingcheng` varchar(200) DEFAULT NULL COMMENT '教室名称',
  `kechengmingcheng` varchar(200) DEFAULT NULL COMMENT '课程名称',
  `xueshengbanji` varchar(200) DEFAULT NULL COMMENT '学生班级',
  `xueshengrenshu` varchar(200) DEFAULT NULL COMMENT '学生人数',
  `jiaoshihao` varchar(200) DEFAULT NULL COMMENT '教室号',
  `zhouci` varchar(200) DEFAULT NULL COMMENT '周次',
  `xingqi` varchar(200) DEFAULT NULL COMMENT '星期',
  `jieci` varchar(200) DEFAULT NULL COMMENT '节次',
  `jiaoshigonghao` varchar(200) DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='教师申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshishenqing`
--

LOCK TABLES `jiaoshishenqing` WRITE;
/*!40000 ALTER TABLE `jiaoshishenqing` DISABLE KEYS */;
INSERT INTO `jiaoshishenqing` VALUES (41,'2024-03-19 05:32:38','教室名称1','课程名称1','学生班级1','学生人数1','教室号1','1','星期一','节次1','教师工号1','教师姓名1','是',''),(42,'2024-03-19 05:32:38','教室名称2','课程名称2','学生班级2','学生人数2','教室号2','1','星期一','节次2','教师工号2','教师姓名2','是',''),(43,'2024-03-19 05:32:38','教室名称3','课程名称3','学生班级3','学生人数3','教室号3','1','星期一','节次3','教师工号3','教师姓名3','是',''),(44,'2024-03-19 05:32:38','教室名称4','课程名称4','学生班级4','学生人数4','教室号4','1','星期一','节次4','教师工号4','教师姓名4','是',''),(45,'2024-03-19 05:32:38','教室名称5','课程名称5','学生班级5','学生人数5','教室号5','1','星期一','节次5','教师工号5','教师姓名5','是',''),(46,'2024-03-19 05:32:38','教室名称6','课程名称6','学生班级6','学生人数6','教室号6','1','星期一','节次6','教师工号6','教师姓名6','是',''),(47,'2024-03-19 05:32:38','教室名称7','课程名称7','学生班级7','学生人数7','教室号7','1','星期一','节次7','教师工号7','教师姓名7','是',''),(48,'2024-03-19 05:32:38','教室名称8','课程名称8','学生班级8','学生人数8','教室号8','1','星期一','节次8','教师工号8','教师姓名8','是','');
/*!40000 ALTER TABLE `jiaoshishenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jieci`
--

DROP TABLE IF EXISTS `jieci`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jieci` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jieci` varchar(200) DEFAULT NULL COMMENT '节次',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='节次';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jieci`
--

LOCK TABLES `jieci` WRITE;
/*!40000 ALTER TABLE `jieci` DISABLE KEYS */;
INSERT INTO `jieci` VALUES (91,'2024-03-19 05:32:38','节次1'),(92,'2024-03-19 05:32:38','节次2'),(93,'2024-03-19 05:32:38','节次3'),(94,'2024-03-19 05:32:38','节次4'),(95,'2024-03-19 05:32:38','节次5'),(96,'2024-03-19 05:32:38','节次6'),(97,'2024-03-19 05:32:38','节次7'),(98,'2024-03-19 05:32:38','节次8');
/*!40000 ALTER TABLE `jieci` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'admin','users','管理员','14slc05xr6xoy1nah41e1yytu439k8yd','2024-03-19 05:36:26','2024-03-19 06:36:26');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2024-03-19 05:32:38');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weihuyuan`
--

DROP TABLE IF EXISTS `weihuyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weihuyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `weixiugonghao` varchar(200) DEFAULT NULL COMMENT '维修工号',
  `weixiuxingming` varchar(200) DEFAULT NULL COMMENT '维修姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `tupian` longtext COMMENT '图片',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `weixiugonghao` (`weixiugonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='维护员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weihuyuan`
--

LOCK TABLES `weihuyuan` WRITE;
/*!40000 ALTER TABLE `weihuyuan` DISABLE KEYS */;
INSERT INTO `weihuyuan` VALUES (31,'2024-03-19 05:32:38','维修工号1','维修姓名1','123456','男','upload/weihuyuan_tupian1.jpg','13823888881'),(32,'2024-03-19 05:32:38','维修工号2','维修姓名2','123456','男','upload/weihuyuan_tupian2.jpg','13823888882'),(33,'2024-03-19 05:32:38','维修工号3','维修姓名3','123456','男','upload/weihuyuan_tupian3.jpg','13823888883'),(34,'2024-03-19 05:32:38','维修工号4','维修姓名4','123456','男','upload/weihuyuan_tupian4.jpg','13823888884'),(35,'2024-03-19 05:32:38','维修工号5','维修姓名5','123456','男','upload/weihuyuan_tupian5.jpg','13823888885'),(36,'2024-03-19 05:32:38','维修工号6','维修姓名6','123456','男','upload/weihuyuan_tupian6.jpg','13823888886'),(37,'2024-03-19 05:32:38','维修工号7','维修姓名7','123456','男','upload/weihuyuan_tupian7.jpg','13823888887'),(38,'2024-03-19 05:32:38','维修工号8','维修姓名8','123456','男','upload/weihuyuan_tupian8.jpg','13823888888');
/*!40000 ALTER TABLE `weihuyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weixiujindu`
--

DROP TABLE IF EXISTS `weixiujindu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weixiujindu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshimingcheng` varchar(200) DEFAULT NULL COMMENT '教室名称',
  `baoxiuriqi` varchar(200) DEFAULT NULL COMMENT '报修日期',
  `jiaoshigonghao` varchar(200) DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `weixiugonghao` varchar(200) DEFAULT NULL COMMENT '维修工号',
  `weixiuxingming` varchar(200) DEFAULT NULL COMMENT '维修姓名',
  `guzhangmiaoshu` longtext COMMENT '故障描述',
  `weixiushijian` datetime DEFAULT NULL COMMENT '维修时间',
  `weixiufankui` longtext COMMENT '维修反馈',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='维修进度';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weixiujindu`
--

LOCK TABLES `weixiujindu` WRITE;
/*!40000 ALTER TABLE `weixiujindu` DISABLE KEYS */;
INSERT INTO `weixiujindu` VALUES (71,'2024-03-19 05:32:38','教室名称1','报修日期1','教师工号1','教师姓名1','维修工号1','维修姓名1','故障描述1','2024-03-19 13:32:38','维修反馈1'),(72,'2024-03-19 05:32:38','教室名称2','报修日期2','教师工号2','教师姓名2','维修工号2','维修姓名2','故障描述2','2024-03-19 13:32:38','维修反馈2'),(73,'2024-03-19 05:32:38','教室名称3','报修日期3','教师工号3','教师姓名3','维修工号3','维修姓名3','故障描述3','2024-03-19 13:32:38','维修反馈3'),(74,'2024-03-19 05:32:38','教室名称4','报修日期4','教师工号4','教师姓名4','维修工号4','维修姓名4','故障描述4','2024-03-19 13:32:38','维修反馈4'),(75,'2024-03-19 05:32:38','教室名称5','报修日期5','教师工号5','教师姓名5','维修工号5','维修姓名5','故障描述5','2024-03-19 13:32:38','维修反馈5'),(76,'2024-03-19 05:32:38','教室名称6','报修日期6','教师工号6','教师姓名6','维修工号6','维修姓名6','故障描述6','2024-03-19 13:32:38','维修反馈6'),(77,'2024-03-19 05:32:38','教室名称7','报修日期7','教师工号7','教师姓名7','维修工号7','维修姓名7','故障描述7','2024-03-19 13:32:38','维修反馈7'),(78,'2024-03-19 05:32:38','教室名称8','报修日期8','教师工号8','教师姓名8','维修工号8','维修姓名8','故障描述8','2024-03-19 13:32:38','维修反馈8');
/*!40000 ALTER TABLE `weixiujindu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianjibanji` varchar(200) DEFAULT NULL COMMENT '年级班级',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `pquestion` varchar(200) DEFAULT NULL COMMENT '密保问题',
  `panswer` varchar(200) DEFAULT NULL COMMENT '密保答案',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xueshengxuehao` (`xueshengxuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2024-03-19 05:32:38','学生学号1','学生姓名1','123456','男','年级班级1','13823888881','密保问题1','密保答案1'),(12,'2024-03-19 05:32:38','学生学号2','学生姓名2','123456','男','年级班级2','13823888882','密保问题2','密保答案2'),(13,'2024-03-19 05:32:38','学生学号3','学生姓名3','123456','男','年级班级3','13823888883','密保问题3','密保答案3'),(14,'2024-03-19 05:32:38','学生学号4','学生姓名4','123456','男','年级班级4','13823888884','密保问题4','密保答案4'),(15,'2024-03-19 05:32:38','学生学号5','学生姓名5','123456','男','年级班级5','13823888885','密保问题5','密保答案5'),(16,'2024-03-19 05:32:38','学生学号6','学生姓名6','123456','男','年级班级6','13823888886','密保问题6','密保答案6'),(17,'2024-03-19 05:32:38','学生学号7','学生姓名7','123456','男','年级班级7','13823888887','密保问题7','密保答案7'),(18,'2024-03-19 05:32:38','学生学号8','学生姓名8','123456','男','年级班级8','13823888888','密保问题8','密保答案8');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueshengshenqing`
--

DROP TABLE IF EXISTS `xueshengshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueshengshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshimingcheng` varchar(200) DEFAULT NULL COMMENT '教室名称',
  `shenqingzhouci` varchar(200) DEFAULT NULL COMMENT '申请周次',
  `shenqingxingqi` varchar(200) DEFAULT NULL COMMENT '申请星期',
  `shenqingjieci` varchar(200) DEFAULT NULL COMMENT '申请节次',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `shenqingshijian` datetime DEFAULT NULL COMMENT '申请时间',
  `shenqingyuanyin` longtext COMMENT '申请原因',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='学生申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueshengshenqing`
--

LOCK TABLES `xueshengshenqing` WRITE;
/*!40000 ALTER TABLE `xueshengshenqing` DISABLE KEYS */;
INSERT INTO `xueshengshenqing` VALUES (61,'2024-03-19 05:32:38','教室名称1','申请周次1','申请星期1','申请节次1','用户名1','学生姓名1','2024-03-19 13:32:38','申请原因1','是',''),(62,'2024-03-19 05:32:38','教室名称2','申请周次2','申请星期2','申请节次2','用户名2','学生姓名2','2024-03-19 13:32:38','申请原因2','是',''),(63,'2024-03-19 05:32:38','教室名称3','申请周次3','申请星期3','申请节次3','用户名3','学生姓名3','2024-03-19 13:32:38','申请原因3','是',''),(64,'2024-03-19 05:32:38','教室名称4','申请周次4','申请星期4','申请节次4','用户名4','学生姓名4','2024-03-19 13:32:38','申请原因4','是',''),(65,'2024-03-19 05:32:38','教室名称5','申请周次5','申请星期5','申请节次5','用户名5','学生姓名5','2024-03-19 13:32:38','申请原因5','是',''),(66,'2024-03-19 05:32:38','教室名称6','申请周次6','申请星期6','申请节次6','用户名6','学生姓名6','2024-03-19 13:32:38','申请原因6','是',''),(67,'2024-03-19 05:32:38','教室名称7','申请周次7','申请星期7','申请节次7','用户名7','学生姓名7','2024-03-19 13:32:38','申请原因7','是',''),(68,'2024-03-19 05:32:38','教室名称8','申请周次8','申请星期8','申请节次8','用户名8','学生姓名8','2024-03-19 13:32:38','申请原因8','是','');
/*!40000 ALTER TABLE `xueshengshenqing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-20 16:17:18
