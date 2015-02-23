drop database if exists db_library_management;
create database db_library_management;
use db_library_management;

create table tbl_book(
    id int auto_increment,
    name varchar(50) not null,
    code varchar(50) not null,
    price varchar(20) not null,
    authors varchar(200) not null,
    publisher varchar(100) not null,
    published_on date not null,
    primary key(id)
);