package top.mhpsy.mybatis2.mapper;

import org.apache.ibatis.annotations.Param;
import top.mhpsy.mybatis2.pojo.User;

import java.util.List;

public interface SqlLikeByMapper {

    List<User> getUserByLikeName(@Param("username")String username);

    List<User> getUserByLikeNameGood(@Param("username")String username);

    List<User> getUserByLikeNameGood2(@Param("username")String username);

}
