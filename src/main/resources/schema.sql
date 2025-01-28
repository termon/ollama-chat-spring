
-- Add data schema statements here
DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(50),
  `email` varchar(50),
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
