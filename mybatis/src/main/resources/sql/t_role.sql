CREATE TABLE `t_role` (
  `use_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `user_teacher` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`use_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

INSERT INTO `t_role` VALUES (1, 2, 'zsww');
INSERT INTO `t_role` VALUES (2, 3, 'lsfy');
INSERT INTO `t_role` VALUES (3, 1, 'bjyx');
INSERT INTO `t_role` VALUES (4, 1, 'zswwszd');
INSERT INTO `t_role` VALUES (5, 1, 'zswwszd');
INSERT INTO `t_role` VALUES (10, 1, 'zswwszd');
INSERT INTO `t_role` VALUES (11, 1, 'zswwszd');
