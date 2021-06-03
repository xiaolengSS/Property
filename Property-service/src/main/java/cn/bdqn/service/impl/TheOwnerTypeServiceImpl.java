package cn.bdqn.service.impl;

import cn.bdqn.domain.TheOwnerType;
import cn.bdqn.mapper.TheOwnerTypeMapper;
import cn.bdqn.service.TheOwnerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "theOwnerTypeService")
public class TheOwnerTypeServiceImpl implements TheOwnerTypeService {

    @Autowired
    private TheOwnerTypeMapper theOwnerTypeMapper;

    @Override
    public List<TheOwnerType> theOwnerTypeQueryAll() {
        return theOwnerTypeMapper.theOwnerTypeselectAll();
    }
}
