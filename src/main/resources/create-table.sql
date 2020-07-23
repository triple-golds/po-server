CREATE TABLE `user_info`
(
    `id`       bigint      NOT NULL AUTO_INCREMENT,
    `username` varchar(40) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_username` (`username`)
)