/*-Insert inot users value-*/

insert into user (user_id,active,email_id,first_name,last_name, role,user_name) values ('1','F','sheet@hcl.com','sheet','kumar','admin','sheet');
insert into user (user_id,active,email_id,first_name,last_name, role,user_name) values ('2','T','rahul@hcl.com','rahul','kmar','admin','rahul');
insert into user (user_id,active,email_id,first_name,last_name, role,user_name) values ('3','T','mohan@hcl.com','mohan','kumar','user','mohan');
/*-Insert inot Leave Request value-*/



insert into stock(id,stock_name,price_per_unit,quantity,is_active) values ('1','sbi','365','2000','true');
insert into stock(id,stock_name,price_per_unit,quantity,is_active) values ('2','icici','365','2000','true');
insert into stock(id,stock_name,price_per_unit,quantity,is_active) values ('3','hcl','365','2000','true');

/*-Insert into userstocks-*/
insert into user_stocks(id,user_id,stock_id,total_quantity,stock_name,total_price,purchased_on) values ('1','1','1','10','sbi','10000',CURRENT_TIMESTAMP);
insert into user_stocks(id,user_id,stock_id,total_quantity,stock_name,total_price,purchased_on) values ('2','2','2','10','sbi','10000',CURRENT_TIMESTAMP);
insert into user_stocks(id,user_id,stock_id,total_quantity,stock_name,total_price,purchased_on) values ('3','3','3','10','sbi','10000',CURRENT_TIMESTAMP);


