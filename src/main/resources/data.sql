INSERT INTO domain (domainID, name, TLD, category, price) VALUES (101, "kvknieuws", "nl", "business news", 350);

INSERT INTO users (username, password, email, enabled) VALUES ("user", "$2a$12$JQdV5OEU3AUyUay2v/8wMucNAlRS5X3Tifr/qCmMj1py9Z1QHIyiu", "user@mail.com", "true");

INSERT INTO authorities (username, authority) VALUES ("user", "ROLE_USER");
INSERT INTO authorities (username, authority) VALUES ("admin", "ROLE_USER");
INSERT INTO authorities (username, authority) VALUES ("admin", "ROLE_ADMIN");