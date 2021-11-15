CREATE TABLE client (
  client_id INT NOT NULL,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  age INT,
  email VARCHAR(255),
  CONSTRAINT pk_client PRIMARY KEY (client_id)
);