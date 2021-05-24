package cn.bdqn.service.impl;

import cn.bdqn.mapper.HouseholdMapper;
import cn.bdqn.service.HouseholdService;
import org.springframework.stereotype.Service;

/**
 * @author jinsuisheng
 * @date 2021年05月24日 14:53
 */
@Service
public class HouseholdServiceImpl implements HouseholdService {

    private HouseholdMapper householdMapper;

    @Override
    public Integer changeByHouseholdUnbundle(Integer id) {
        return householdMapper.updateByHouseholdUnbundle(id);
    }

    @Override
    public Integer changeByHouseholdBinding(Integer id, Integer houseId, Integer communityId) {
        return householdMapper.updateByHouseholdBinding(id,houseId,communityId);
    }
}
