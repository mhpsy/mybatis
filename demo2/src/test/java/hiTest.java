import org.junit.Test;
import top.mhpsy.mybatis2.mapper.hi;
import top.mhpsy.mybatis2.pojo.User;
import top.mhpsy.mybatis2.utils.SqlSessionUtils;

import java.util.List;

public class hiTest {

    @Test
    public void getUserByTableNameTest(){
        hi mapper = SqlSessionUtils.getSqlSession().getMapper(hi.class);
        List<User> my_user = mapper.getUserByTableName("my_user");
        System.out.println(my_user);
    }

    @Test
    public void insertUserTest(){
        hi mapper = SqlSessionUtils.getSqlSession().getMapper(hi.class);
        User user = new User(null,"qq","qwer@qq.com","China");
        System.out.println(user);
//User(id=null, name=qq, email=qwer@qq.com, address=China)
        mapper.insertUser(user);
        System.out.println(user);
//User(id=15, name=qq, email=qwer@qq.com, address=China)
    }

}
