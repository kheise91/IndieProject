CREATE TABLE user (
	id INT AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(30) NOT NULL,
	password TEXT NOT NULL,
	first_name VARCHAR(30) NOT NULL,
	last_name VARCHAR(30) NOT NULL,
	email_address VARCHAR(50) NOT NULL,
	phone_number CHAR(12) NOT NULL,
	city VARCHAR(30) NOT NULL,
	state CHAR(2) NOT NULL,
	zip_code CHAR(5) NOT NULL,
	birthdate DATE NOT NULL,
	favorite_genre VARCHAR(20) NOT NULL,
	CONSTRAINT user_id_uindex UNIQUE (id),
	CONSTRAINT user_username_uindex UNIQUE (username)
) ENGINE = InnoDB;


CREATE TABLE role (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20) NOT NULL,
	username VARCHAR(30) NOT NULL,
	user_id INT NOT NULL,
	CONSTRAINT role_id_uindex UNIQUE (id)
) ENGINE = InnoDB;

ALTER TABLE role
	ADD CONSTRAINT role_user_user_id_fk
		FOREIGN KEY (user_id) REFERENCES user (id)
			ON UPDATE CASCADE ON DELETE CASCADE;

CREATE index role_user_user_id_fk
	ON role (user_id);


CREATE TABLE user_show (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT NOT NULL,
  show_id VARCHAR(30) NOT NULL,
  FOREIGN KEY (user_id) REFERENCES user(id)
) ENGINE = InnoDB;

CREATE TABLE user_friend (
  user_id INT NOT NULL,
  friend_id INT NOT NULL,
  PRIMARY KEY (user_id, friend_id),
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (friend_id) REFERENCES user(id)
) ENGINE = InnoDB;