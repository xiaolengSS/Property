package cn.bdqn.service;

import cn.bdqn.domain.Household;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HouseholdService {

    //根据条件分页查询业主
    public PageInfo<Household> queryAllByHouseholdPage(Integer currentPage, Integer pageSize, Household household);

    //根据id查询数据
    public Household queryHousehold(Household household);

    //添加业主
    public int saveHousehold(Household household);

    //根据id修改业主
    public void updateHousehold(Household household);

    //根据id删除业主
    public void deleteHousehold(Integer id);


}