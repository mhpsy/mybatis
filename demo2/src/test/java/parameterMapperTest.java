import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.mhpsy.mybatis2.mapper.ParameterMapper;
import top.mhpsy.mybatis2.pojo.User;
import top.mhpsy.mybatis2.utils.SqlSessionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void testGetUserByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("username","java");
        User userByMap = mapper.getUserByMap(map);
        System.out.println(userByMap);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User a = new User(null,"ll","qwer@pro.me","Chine");
        int i = mapper.insertUser(a);
        System.out.println(i);
    }

    @Test
    public void testGetCountUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int countUser = mapper.getCountUser();
        System.out.println(countUser);
    }

    @Test
    public void TestGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> userByIdForMap = mapper.getUserByIdToMap(13);
        System.out.println(userByIdForMap);
    }
    @Test
    public void TestGetAllUserByIdToMap(){
        ParameterMapper mapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        Map<String, Object> allUserToMap = mapper.getAllUserToMap();
        System.out.println(allUserToMap);
    }

}
