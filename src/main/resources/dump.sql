CREATE TABLE genre (
  id INT AUTO_INCREMENT PRIMARY KEY,
  code VARCHAR(15);
  name VARCHAR(15);
) ENGINE = InnoDB;


CREATE TABLE user (
	id INT AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(30) NOT NULL,
	email_address VARCHAR(50) NOT NULL,
	password CHAR(64) NOT NULL,
	first_name VARCHAR(30) NOT NULL,
	last_name VARCHAR(30) NOT NULL,
	birth_date DATE NOT NULL,
	city VARCHAR(30) NOT NULL,
	state CHAR(2) NOT NULL,
	zip_code CHAR(5) NOT NULL,
	favorite_genre INT NOT NULL,
	CONSTRAINT user_id_uindex UNIQUE (id),
	CONSTRAINT user_username_uindex UNIQUE (username),
	FOREIGN KEY (favorite_genre) REFERENCES genre (id)
) ENGINE = InnoDB;


CREATE TABLE role (
	id int auto_increment
		primary key,
	name varchar(20) not null,
	username varchar(30) not null,
	user_id int not null,
	constraint role_id_uindex
		unique (id)
) ENGINE = InnoDB;

alter table role
	add constraint role_user_user_id_fk
		foreign key (user_id) references user (id)
			on update cascade on delete cascade;

create index role_user_user_id_fk
	on role (user_id);