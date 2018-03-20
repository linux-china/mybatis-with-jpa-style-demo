CREATE TABLE account (
  id         INT PRIMARY KEY AUTO_INCREMENT,
  user_name  VARCHAR(32),
  email      VARCHAR(128),
  password   VARCHAR(32),
  created_at DATETIME
) DEFAULT CHARSET = utf8;
