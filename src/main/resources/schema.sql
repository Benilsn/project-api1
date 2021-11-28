CREATE TABLE IF NOT EXISTS client (
  clientId INT auto_increment,
  firstName VARCHAR(255) NOT NULL,
  lastName VARCHAR(255) NOT NULL,
  age INT NOT NULL,
  email VARCHAR(255) NOT NULL,
  userRole VARCHAR(255) NOT NULL,
  userName VARCHAR(255) NOT NULL,
  userPassword VARCHAR(255) NOT NULL,
  primary key (id)
);
