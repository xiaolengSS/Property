package cn.bdqn.service.impl;

import cn.bdqn.domain.Dispatch;
import cn.bdqn.mapper.DispatchMapper;
import cn.bdqn.service.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "dispatchService")
public class DispatchServiceImpl implements DispatchService {

    @Autowired
    private DispatchMapper dispatchMapper;

    @Override
    public List<Dispatch> dispatchQueryAll() {
        return dispatchMapper.dispatchQueryAll();
    }
}
