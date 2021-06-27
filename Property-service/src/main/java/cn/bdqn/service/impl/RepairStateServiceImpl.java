package cn.bdqn.service.impl;

import cn.bdqn.domain.RepairState;
import cn.bdqn.mapper.RepairStateMapper;
import cn.bdqn.service.RepairStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "repairStateService")
public class RepairStateServiceImpl implements RepairStateService {

    @Autowired
    private RepairStateMapper repairStateSMapper;

    @Override
    public List<RepairState> repairStateQueryAll() {
        return repairStateSMapper.repairStateSelectAll();
    }
}
