create database dbtesting

drop database dbtesting

create table client (
	id 			SERIAL PRIMARY key,
	name 		varchar(100),
	city 		varchar(80),
	job 		varchar(80),
	university	varchar(80)
)

select * from client

select count(*) from client

delete from client	

drop table client
