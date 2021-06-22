package cn.bdqn.service.impl;

import cn.bdqn.domain.RepairSettings;
import cn.bdqn.mapper.RepairSettingsMapper;
import cn.bdqn.service.RepairSettingsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RepairSettingsServiceImpl implements RepairSettingsService {

    @Autowired
    private RepairSettingsMapper repairSettingsMapper;

    @Override
    //带分页的查询
    public PageInfo<RepairSettings> repairSettingsQueryVague(Integer currentPage, Integer pageSize,RepairSettings repairSettings) {

        PageHelper.startPage(currentPage,pageSize);
        List<RepairSettings> repairSettingsList = repairSettingsMapper.repairSettingsSelectVague(repairSettings);

        PageInfo<RepairSettings> pageInfo = new PageInfo<RepairSettings>();

        return pageInfo;
    }

    @Override
    public void repairSettingsUpdateById(RepairSettings repairSettings) {
        repairSettingsMapper.repairSettingsUpdateById(repairSettings);
    }

    @Override
    public void repairSettingsDeleteById(Integer id) {
        repairSettingsMapper.repairSettingsDeleteById(id);
    }

    @Override
    public void repairSettingsSave(RepairSettings repairSettings) {
        repairSettingsMapper.repairSettingsInsert(repairSettings);
    }
}
