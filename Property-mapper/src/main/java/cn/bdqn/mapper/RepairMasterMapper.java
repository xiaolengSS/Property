package cn.bdqn.mapper;

import cn.bdqn.domain.RepairMaster;

import java.util.List;

public interface RepairMasterMapper {

    //添加报修师傅
    public void repairMasterInsert(RepairMaster repairMaster);

    //查询报修师傅
    public List<RepairMaster> repairMasterSelectAll();

    //根据id删除保修师傅
    public void repairMasterDelete(Integer id);

    //根据id修改保修师傅状态---->变更
    public void repairMasterUpdate(RepairMaster repairMaster);


}
