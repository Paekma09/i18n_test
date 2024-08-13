DROP TABLE if exists translations CASCADE;

CREATE TABLE translations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    language VARCHAR(255) NOT NULL,
    `key` VARCHAR(255) NOT NULL,
    `value` VARCHAR(255) NOT NULL
);