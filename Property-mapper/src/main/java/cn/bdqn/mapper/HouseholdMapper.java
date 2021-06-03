package cn.bdqn.mapper;

import cn.bdqn.domain.Household;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseholdMapper {
    //查询全部信息&根据条件单个或多个查询&根据id查询业主信息
    public List<Household> selectHousehold(Household household);
    //添加业主
    public int insertHousehold(Household household);
    //根据id修改业主
    public void updateHousehold(Household household);
    //根据id删除业主
    public void deleteHousehold(Integer id);


}
