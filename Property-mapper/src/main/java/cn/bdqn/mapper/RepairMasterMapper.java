package cn.bdqn.mapper;

import cn.bdqn.domain.RepairMaster;

import java.util.List;

public interface RepairMasterMapper {

    //添加报修师傅
    public void repairMasterInsert();

    //查询报修师傅
    public List<RepairMaster> repairMasterSelectAll();

    //根据id删除保修师傅
    public void repairMasterDelete(Integer id);


}
