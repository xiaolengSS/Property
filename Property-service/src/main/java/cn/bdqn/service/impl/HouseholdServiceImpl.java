package cn.bdqn.service.impl;

import cn.bdqn.domain.Household;
import cn.bdqn.mapper.HouseholdMapper;
import cn.bdqn.service.HouseholdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jinsuisheng
 * @date 2021年05月24日 14:53
 */
@Service
public class HouseholdServiceImpl implements HouseholdService {

    @Resource
    private HouseholdMapper householdMapper;

    //业主房屋解绑 id:业主id
    @Override
    public Integer changeByHouseholdUnbundle(Integer id) {
        return householdMapper.updateByHouseholdUnbundle(id);
    }

    //业主房屋绑定 id:业主id houseId：房屋ID communityId：小区ID
    @Override
    public Integer changeByHouseholdBinding(Integer id, Integer houseId, Integer communityId) {
        return householdMapper.updateByHouseholdBinding(id,houseId,communityId);
    }

    //根据业主ID查询业主信息
    @Override
    public Household queryByHousehold(Integer id) {
        return householdMapper.selectByHousehold(id);
    }
}
