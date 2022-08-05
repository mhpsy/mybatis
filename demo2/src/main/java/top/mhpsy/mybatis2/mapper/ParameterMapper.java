package top.mhpsy.mybatis2.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import top.mhpsy.mybatis2.pojo.User;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface ParameterMapper {

    List<User> getAllUser();

    User getUserById(int id);

    User getUserByIdAndName(int id,String name);

    User getUserByMap(Map<String , Object> map);

    int insertUser(User user);

    int getCountUser();

    Map<String,Object> getUserByIdToMap(@Param("id")Integer id);

    @MapKey("id")
    Map<String,Object> getAllUserToMap();

}
