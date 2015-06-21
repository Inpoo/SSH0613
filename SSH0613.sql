create database SSH0613;
use SSH0613;
create table user(userId int not null primary key auto_increment,username varchar(20), password varchar(20));
insert into user(username, password) values('firstuser', '123');