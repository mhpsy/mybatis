package top.mhpsy.mybatis2.mapper;

import org.apache.ibatis.annotations.Param;

public interface deleteMore {

    int deleteMore1(@Param("ids")String ids);

}
