package cn.bdqn.service;

import cn.bdqn.domain.RepairSettings;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface RepairSettingsService {

    //查询全部&根据id，类型名称，派单方式，派单类型进行模糊查询
    public PageInfo<RepairSettings> repairSettingsQueryVague(Integer currentPage, Integer pageSize, RepairSettings repairSettings);
    //根据id修改报修设置的信息
    public void repairSettingsUpdateById(RepairSettings repairSettings);

    //根据id实现删除
    public void repairSettingsDeleteById(Integer id);

    //添加
    public void repairSettingsSave(RepairSettings repairSettings);

}
