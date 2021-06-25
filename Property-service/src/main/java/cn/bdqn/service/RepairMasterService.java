package cn.bdqn.service;

import cn.bdqn.domain.RepairMaster;
import com.github.pagehelper.PageInfo;

public interface RepairMasterService {

    //根据报修设置id查询全部保修师傅信息--->分页
    public PageInfo<RepairMaster> repairMasterQueryAll(Integer currentPage, Integer pageSize,Integer rapairSettingsId);

    //根据id修改保修师傅信息
    public void repairMasterUpdate(RepairMaster repairMaster);

    //根据id删除保修师傅信息
    public void repairMasterDelete(Integer id);

    //添加报修师傅
    public void repairMasterSave(RepairMaster repairMaster);

}
