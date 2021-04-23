package cn.bdqn.service.impl;

import cn.bdqn.domain.HouseTypeOffice;
import cn.bdqn.mapper.HouseOfficeMapper;
import cn.bdqn.service.HouseOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("houseOfficeService")
public class HouseOfficeServiceImpl implements HouseOfficeService {

    @Autowired
    private HouseOfficeMapper houseOfficeMapper;

    //查询全部几厅
    @Override
    public List<HouseTypeOffice> queryAllByOffice() {
        return houseOfficeMapper.selectAllTypeOffice();
    }

}
