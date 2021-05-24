package cn.bdqn.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author jinsuisheng
 * @date 2021年05月24日 14:36
 * 业主Mapper类
 */
public interface HouseholdMapper {
    //业主房屋解绑 id:业主id
    public Integer updateByHouseholdUnbundle(Integer id);
    //业主房屋绑定 id:业主id houseId：房屋ID communityId：小区ID
    public Integer updateByHouseholdBinding(@Param("id") Integer id,@Param("houseId") Integer houseId,@Param("communityId") Integer communityId);
}
