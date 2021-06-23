package cn.bdqn.service;

import cn.bdqn.domain.RepairState;

import java.util.List;

public interface RepairStateService {

    //查询全部报修师傅状态
    public List<RepairState> repairStateQueryAll();


}
