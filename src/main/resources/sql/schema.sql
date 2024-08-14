DROP TABLE if exists translation CASCADE;
DROP TABLE if exists translation_value CASCADE;

CREATE TABLE translation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    `key` VARCHAR(255) NOT NULL
);

CREATE TABLE translation_value (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    translation_id BIGINT NOT NULL,
    language_code VARCHAR(10) NOT NULL,
    value TEXT NOT NULL,
    FOREIGN KEY (translation_id) REFERENCES translation(id)
);