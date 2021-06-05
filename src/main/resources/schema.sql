create table users(
	username varchar(50) not null primary key,
	password varchar(50) not null,
	enabled boolean not null
);

create table authorities (
	username varchar(50) not null primary key REFERENCES users (username),
	authority varchar(50) not null
);

 create unique index ix_auth_username on authorities (username,authority);