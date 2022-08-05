package top.mhpsy.mybatis2.mapper;

import org.apache.ibatis.annotations.Param;
import top.mhpsy.mybatis2.pojo.User;

import java.util.List;

public interface hi {

    List<User> getUserByTableName(@Param("TableName")String TableName);

    /**
     * 将自增id添加进入User对象
     *  <insert id="insertUser" useGeneratedKeys="true" keyProperty="id">
     *      主要就是这一行
     *     <insert id="insertUser" useGeneratedKeys="true" keyProperty="id">
     *         insert into my_user values (null,#{name},#{email},#{address});
     *     </insert>
     * @param user
     */
    void insertUser(User user);
}
