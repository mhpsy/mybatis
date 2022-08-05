package top.mhpsy.mybatis2.mapper;

import top.mhpsy.mybatis2.pojo.User;

import java.util.List;

public interface ParameterMapper {

    List<User> getAllUser();

    User getUserById(int id);

    User getUserByIdAndName(int id,String name);

}
