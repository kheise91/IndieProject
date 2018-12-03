create table role
(
	id int auto_increment
		primary key,
	name varchar(20) not null,
	username varchar(30) not null,
	user_id int not null,
	constraint role_id_uindex
		unique (id)
)
;

create index role_user_user_id_fk
	on role (user_id)
;

create table user
(
	id int auto_increment
		primary key,
	username varchar(30) not null,
	email_address varchar(50) not null,
	password char(64) not null,
	first_name varchar(30) null,
	last_name varchar(30) null,
	birth_date date null,
	zip_code char(5) not null,
	favorite_genre varchar(20) not null,
	constraint user_id_uindex
		unique (id),
	constraint user_username_uindex
		unique (username)
)
;

alter table role
	add constraint role_user_user_id_fk
		foreign key (user_id) references user (id)
			on update cascade on delete cascade
;

