import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.mhpsy.mybatis2.mapper.ParameterMapper;
import top.mhpsy.mybatis2.pojo.User;
import top.mhpsy.mybatis2.utils.SqlSessionUtils;

import java.util.List;

public class parameterMapperTest {
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(user-> System.out.println(user));
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
    }

    @Test
    public void testGetUserByIdAndName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User java = mapper.getUserByIdAndName(1, "java");
        System.out.println(java);
    }
}
