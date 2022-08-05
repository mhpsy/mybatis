import org.junit.Test;
import top.mhpsy.mybatis2.mapper.SqlLikeByMapper;
import top.mhpsy.mybatis2.pojo.User;
import top.mhpsy.mybatis2.utils.SqlSessionUtils;

import java.util.List;

/**
 * 模糊查询
 */
public class SqlLikeByMapperTest {

    @Test
    public void TestGetUserByLikeName(){
        SqlLikeByMapper mapper = SqlSessionUtils.getSqlSession().getMapper(SqlLikeByMapper.class);
        List<User> l = mapper.getUserByLikeName("l");
        System.out.println(l);
    }

    @Test
    public void TestGetUserByLikeNameGood(){
        SqlLikeByMapper mapper = SqlSessionUtils.getSqlSession().getMapper(SqlLikeByMapper.class);
        List<User> l = mapper.getUserByLikeNameGood("l");
        System.out.println(l);
    }

    @Test
    public void TestGetUserByLikeNameGood2(){
        SqlLikeByMapper mapper = SqlSessionUtils.getSqlSession().getMapper(SqlLikeByMapper.class);
        List<User> l = mapper.getUserByLikeNameGood2("l");
        System.out.println(l);
    }

}
