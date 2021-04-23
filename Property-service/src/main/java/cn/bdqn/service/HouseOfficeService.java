package cn.bdqn.service;

import cn.bdqn.domain.HouseTypeOffice;

import java.util.List;

public interface HouseOfficeService {
    //查询全部几厅
    public List<HouseTypeOffice> queryAllByOffice();

}
