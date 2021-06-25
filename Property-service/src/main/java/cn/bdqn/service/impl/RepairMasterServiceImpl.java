package cn.bdqn.service.impl;

import cn.bdqn.domain.RepairMaster;
import cn.bdqn.mapper.RepairMasterMapper;
import cn.bdqn.service.RepairMasterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "repairMasterService")
public class RepairMasterServiceImpl implements RepairMasterService {

    @Autowired
    private RepairMasterMapper repairMasterMapper;

    @Override
    public PageInfo<RepairMaster> repairMasterQueryAll(Integer currentPage, Integer pageSize,Integer rapairSettingsId) {

        PageHelper.startPage(currentPage,pageSize);
        List<RepairMaster> repairMasters = repairMasterMapper.repairMasterSelectAll(rapairSettingsId);

        PageInfo<RepairMaster> pageInfo = new PageInfo<RepairMaster>(repairMasters);

        return pageInfo;
    }

    @Override
    public void repairMasterUpdate(RepairMaster repairMaster) {
        repairMasterMapper.repairMasterUpdate(repairMaster);
    }

    @Override
    public void repairMasterDelete(Integer id) {
        repairMasterMapper.repairMasterDelete(id);
    }

    @Override
    public void repairMasterSave(RepairMaster repairMaster) {
        repairMasterMapper.repairMasterInsert(repairMaster);
    }
}
