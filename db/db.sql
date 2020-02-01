SET
  FOREIGN_KEY_CHECKS = 0;
#------------------------------------------------------------------------
  DROP TABLE IF EXISTS `jcart_administrator`;
CREATE TABLE `jcart_administrator` (
    `administrator_id` int NOT NULL auto_increment,
    `username` varchar(20) not null,
    `real_name` varchar(20),
    `encrypted_password` varchar(100) not null,
    `status` tinyint not null,
    `create_time` datetime not null,
    `avatar_url` varchar(100),
    PRIMARY KEY (`administrator_id`),
    unique `idx_username` (`username`),
    index `idx_real_name` (`real_name`)
  ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 auto_increment = 1;
#--------------------------------------------------------------------------
