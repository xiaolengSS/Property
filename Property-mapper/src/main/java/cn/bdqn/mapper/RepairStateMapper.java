package cn.bdqn.mapper;

import cn.bdqn.domain.RepairState;

import java.util.List;

public interface RepairStateMapper {

    //查询全部保修师傅状态
    public List<RepairState> repairStateSelectAll();

}
