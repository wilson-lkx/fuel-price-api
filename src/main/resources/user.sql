CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(20) NOT NULL,
  `password` varchar(128) NOT NULL,
  `salt` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`email`)
);

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_fk_idx` (`user_id`),
  KEY `role_fk_idx` (`role_id`),
  CONSTRAINT `role_fk` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `user_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
);

INSERT INTO `user_role` (`user_id`, `role_id`) VALUES (1, 2);
INSERT INTO `user_role` (`user_id`, `role_id`) VALUES (2, 1);

INSERT INTO `role` (`name`) VALUES ('USER');
INSERT INTO `role` (`name`) VALUES ('ADMIN');

INSERT INTO `user` (`email`, `salt`, `password`) VALUES ('admin@gmail.com', 'IeU73a2Rjr', '90ac924c9a42c0a9c7d8120be32ff1d5');
INSERT INTO `user` (`email`, `salt`, `password`) VALUES ('abc@gmail.com', 'SvX2tAlSAk', '824093fd408bc74340ab6ba21660d283');

CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `user_first_name` varchar(128) NOT NULL,
  `user_last_name` varchar(128) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_fk_idx` (`user_id`),
  CONSTRAINT `user_info_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
);

INSERT INTO `user_info` (`user_id`, `user_first_name`, `user_last_name`) VALUES ('1', 'Administrator', '1');
INSERT INTO `user_info` (`user_id`, `user_first_name`, `user_last_name`) VALUES ('2', 'Wilson', 'Lai');


SELECT user.id FROM (SELECT * FROM user WHERE email = 'abc@gmail.com') AS user WHERE MD5(CONCAT('abc', user.salt)) = user.password;
