package cn.bdqn.service;

import cn.bdqn.domain.Household;

public interface HouseholdService {
    //业主房屋解绑 id:业主id
    public Integer changeByHouseholdUnbundle(Integer id);
    //业主房屋绑定 id:业主id houseId：房屋ID communityId：小区ID
    public Integer changeByHouseholdBinding(Integer id,Integer houseId,Integer communityId);
    //根据业主ID查询业主信息
    public Household queryByHousehold(Integer id);
}
