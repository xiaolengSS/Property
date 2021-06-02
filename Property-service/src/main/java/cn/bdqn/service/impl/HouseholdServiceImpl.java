package cn.bdqn.service.impl;

import cn.bdqn.domain.Household;
import cn.bdqn.mapper.HouseholdMapper;
import cn.bdqn.service.HouseholdService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service("householdService")
public class HouseholdServiceImpl implements HouseholdService {

    @Autowired
    private HouseholdMapper householdMapper;

    //根据条件分页查询业主
    @Override
    public PageInfo<Household> queryAllByHouseholdPage(Integer currentPage, Integer pageSize,Household household) {


        PageHelper.startPage(currentPage,pageSize);

        List<Household> households = householdMapper.selectHousehold(household);

        PageInfo<Household> pageInfo = new PageInfo<Household>(households);


        return pageInfo;
    }
    //查询单条业主信息
    @Override
    public Household queryHousehold(Household household) {

        List<Household> households = householdMapper.selectHousehold(household);
        Household household1 = (Household) households.get(0);

        return household1;
    }

    //添加业主
    @Override
    public int saveHousehold(Household household) {
        int i = householdMapper.insertHousehold(household);
        return i;
    }
    //根据id修改业主
    @Override
    public void updateHousehold(Household household) {
        householdMapper.updateHousehold(household);
    }
    //根据id删除业主
    @Override
    public void deleteHousehold(Integer id) {
        householdMapper.deleteHousehold(id);
    }




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
}
