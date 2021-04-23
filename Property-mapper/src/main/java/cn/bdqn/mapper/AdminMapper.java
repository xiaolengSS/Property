package cn.bdqn.mapper;
import cn.bdqn.domain.Admin;
import org.apache.ibatis.annotations.Param;


public interface AdminMapper {
    //查询管理员是否存在
    public Integer selectByAdmin(@Param("admin") Admin admin);
}
