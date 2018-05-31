create table Player (
	id int not null,
	width dec,
	height float8,
	name varchar(40) not null,
	surname char(40) not null,
	reg_date timestamp not null,
	reg_date2 timestamp with time zone not null
);