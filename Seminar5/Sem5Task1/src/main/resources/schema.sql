create table account (
                         id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(50) NOT NULL,
                         amount DOUBLE NOT NULL
);

INSERT INTO account (name,amount) VALUES ('Jane Down', 1000);
INSERT INTO account (name,amount) VALUES ('John Read', 1000);