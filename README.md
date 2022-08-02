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
## 创建MyBatis的核心配置文件
>习惯上命名为`mybatis-config.xml`，这个文件名仅仅只是建议，并非强制要求。将来整合Spring之后，这个配置文件可以省略，所以大家操作时可以直接复制、粘贴。
>核心配置文件主要用于配置连接数据库的环境以及MyBatis的全局配置信息
>核心配置文件存放的位置是src/main/resources目录下
```xml
<?xml version="1.0" encoding="UTF-8" ?>  
<!DOCTYPE configuration  
PUBLIC "-//mybatis.org//DTD Config 3.0//EN"  
"http://mybatis.org/dtd/mybatis-3-config.dtd">  
<configuration>  
	<!--设置连接数据库的环境-->  
	<environments default="development">  
		<environment id="development">  
			<transactionManager type="JDBC"/>  
			<dataSource type="POOLED">  
				<property name="driver" value="com.mysql.cj.jdbc.Driver"/>  
				<property name="url" value="jdbc:mysql://localhost:3306/MyBatis"/>  
				<property name="username" value="root"/>  
				<property name="password" value="123456"/>  
			</dataSource>  
		</environment>  
	</environments>  
	<!--引入映射文件-->  
	<mappers>  
		<mapper resource="mappers/UserMapper.xml"/>  
	</mappers>  
</configuration>
```
