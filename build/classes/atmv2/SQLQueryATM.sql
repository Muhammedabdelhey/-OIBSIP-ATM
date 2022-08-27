create database ATM
create table Uesrs(
user_id int unique,
password int,
user_name nvarchar(60),
user_balance float)
select * from Transactions 
insert into Uesrs values(3,1234,'Test',1000)

create table  Transactions(
user_id int ,
user_name nvarchar(60),
user_befor_balance float,
user_after_balance float,
transation_type nvarchar(40),
transation_date nvarchar(40)
)
drop table Transactions
