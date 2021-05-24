package cn.bdqn.service;

import org.apache.ibatis.annotations.Param;

public interface HouseholdService {
    //业主房屋解绑 id:业主id
    public Integer changeByHouseholdUnbundle(Integer id);
    //业主房屋绑定 id:业主id houseId：房屋ID communityId：小区ID
    public Integer changeByHouseholdBinding(@Param("id") Integer id, @Param("houseId") Integer houseId, @Param("communityId") Integer communityId);
}
