CREATE TABLE IF NOT EXISTS client (
  client_id INT PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  age INT NOT NULL,
  email VARCHAR(255) NOT NULL,
  user_role VARCHAR(255),
  user_name VARCHAR(255),
  user_password VARCHAR(255)
);

