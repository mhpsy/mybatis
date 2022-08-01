package top.mhpsy.mybatis.mapper;

import top.mhpsy.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     * @return 添加个
     */
    int insertUser();

    int updateUser();

    int deleteUser();

    User queryUser();

    List<User> queryAllUser();

}
