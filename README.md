# mybatis

数据库表：
```sql
create database mybatisUse;

use mybatisUse;

create table my_user (
    id int unsigned auto_increment,
    name varchar(20),
    email varchar(32),
    address varchar(20),
    primary key(id)
);

alter table my_user modify email varchar(32);

insert into my_user (id, name, email, address) VALUE (1,'java','mmm@nnnn.ee','China');
insert into my_user (name, email, address) VALUE ('java','mmm@nnnn.ee','China');
insert into my_user (name, email, address) VALUE ('php','mmm@nnnn.ee','China');
insert into my_user (name, email, address) VALUE ('c','mmm@nnnn.ee','China');
insert into my_user (name, email, address) VALUE ('go','mmm@nnnn.ee','China');
insert into my_user (name, email, address) VALUE ('rust','mmm@nnnn.ee','China');

select name,email,address from my_user where id = 3;

```

