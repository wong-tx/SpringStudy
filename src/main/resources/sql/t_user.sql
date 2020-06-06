CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `insertdate` datetime DEFAULT NULL,
  `msg` varchar(255) DEFAULT NULL,
  `sex` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;


INSERT INTO `t_user` VALUES (1, '6379', '9', NULL, '1', NULL);
INSERT INTO `t_user` VALUES (2, '1005', '1', NULL, '1', NULL);
INSERT INTO `t_user` VALUES (3, '7293', '111111', NULL, '1', NULL);
INSERT INTO `t_user` VALUES (4, '123456', '2', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (5, '123456', '2', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (7, '111111', '1234', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (10, '312', '1234', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (11, '0419', '234', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (12, '0419', '1234', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (13, '369', '936', NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (14, '1114', '1113', '2020-06-01 00:00:00', NULL, NULL);
INSERT INTO `t_user` VALUES (15, NULL, NULL, '2020-06-02 00:00:00', 'tag测试', b'1');
INSERT INTO `t_user` VALUES (16, 'now测试', 'now测试', '2020-06-02 09:23:17', NULL, NULL);
INSERT INTO `t_user` VALUES (19, 'xz', NULL, '2020-06-01 10:30:56', 'zg', NULL);
INSERT INTO `t_user` VALUES (20, 'xz', 'zg', '2020-06-01 10:59:24', '从此不敢看观音', NULL);
INSERT INTO `t_user` VALUES (21, 'for测试', 'for测试', NULL, 'for测试', NULL);
INSERT INTO `t_user` VALUES (22, 'for测试1', 'for测试1', NULL, 'for测试1', NULL);
INSERT INTO `t_user` VALUES (23, 'for测试', 'for测试', NULL, 'for测试', NULL);
INSERT INTO `t_user` VALUES (24, 'for测试1', 'for测试1', NULL, 'for测试1', NULL);
INSERT INTO `t_user` VALUES (25, 'for测试', 'for测试', NULL, 'for测试', NULL);
INSERT INTO `t_user` VALUES (26, 'for测试1', 'for测试1', NULL, 'for测试1', NULL);
INSERT INTO `t_user` VALUES (32, '今日份zsww', '今日份zsww', '2020-06-03 11:25:50', '从此不敢看观音', b'0');
INSERT INTO `t_user` VALUES (34, NULL, NULL, NULL, '从此不敢看观音,今日份zsww', NULL);
