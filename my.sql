use spring;

create table book(
	isbn varchar(50) primary key,
	book_name varchar(50),
	price int
);

create table book_stock(
	isbn varchar(50) primary key,
	stock int,
	check(stock >0)
);


create table account(
	username varchar(50) primary key,
	balance int,
	check(balance > 0)
);


insert into account values ('jack', '200');
insert into account values ('mike', '100');
insert into account values ('tom', '50');


insert into book_stock values ('1001', '5');
insert into book_stock values ('1002', '0');
insert into book_stock values ('1003', '1');

insert into book values ('1001', 'math_book', '20');
insert into book values ('1002', 'english_book', '19');
insert into book values ('1003', 'cs', '60');

update book_stock set stock = "5";
update account set balance = "200";
