CREATE TABLE IF NOT EXISTS users (
                       id BIGSERIAL PRIMARY KEY,       -- BIGSERIAL reemplaza AUTO_INCREMENT
                       name VARCHAR(255) NOT NULL,
                       last_name VARCHAR(255) NOT NULL,
                       age INT NOT NULL
);

CREATE VIEW usersView AS
SELECT id, name, last_name, age
FROM users;