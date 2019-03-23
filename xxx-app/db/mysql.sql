-- 用户表
CREATE TABLE `tb_user` (
  `user_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_no` varchar(20) NOT NULL DEFAULT '' COMMENT '用户编号，7-10位随机数',
  `openid` varchar(512) DEFAULT NULL COMMENT '微信openid',
  `appid` varchar(128) DEFAULT NULL COMMENT '微信appid',
  `unionid` varchar(512) DEFAULT NULL COMMENT '微信unionid',
  `username` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名==手机号',
  `nickname` varchar(50) DEFAULT NULL COMMENT '用户昵称',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(64) NOT NULL DEFAULT '' COMMENT '密码',
  `avatar_url` varchar(512) DEFAULT NULL COMMENT '头像',
  `gender` int(1) NOT NULL DEFAULT '0' COMMENT '0=未知，1=男，2=女',
  `country` varchar(16) DEFAULT NULL COMMENT '国家',
  `province` varchar(16) DEFAULT NULL COMMENT '省份',
  `city` varchar(16) DEFAULT NULL COMMENT '城市',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `deleted` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0=未删除，1=删除',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户';

-- 用户Token表
CREATE TABLE `tb_token` (
  `user_id` bigint NOT NULL,
  `token` varchar(100) NOT NULL COMMENT 'token',
  `expire_time` datetime COMMENT '过期时间',
  `update_time` datetime COMMENT '更新时间',
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX (`token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户Token';

-- 账号：13612345678  密码：admin
INSERT INTO `tb_user` (`user_id`, `user_no`, `openid`, `appid`, `unionid`, `username`, `nickname`, `mobile`, `email`, `password`, `avatar_url`, `gender`, `country`, `province`, `city`, `create_time`, `deleted`)
VALUES
	(1, '1234567', NULL, NULL, NULL, 'mark', NULL, '13612345678', NULL, '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', NULL, 1, NULL, NULL, NULL, '2017-03-23 22:37:41', 0);

