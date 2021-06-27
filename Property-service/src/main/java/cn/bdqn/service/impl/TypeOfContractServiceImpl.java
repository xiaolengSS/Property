package cn.bdqn.service.impl;

import cn.bdqn.domain.InformationOfCaringPersonnel;
import cn.bdqn.domain.TypeOfContract;
import cn.bdqn.mapper.TypeOfContractMapper;
import cn.bdqn.service.TypeOfContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TypeOfContractServiceImpl implements TypeOfContractService {
    @Autowired
    private TypeOfContractMapper typeOfContractMapper;

    @Override
    public List<TypeOfContract> selectAll() {
        return typeOfContractMapper.selectAll();
    }

    @Override
    public Integer inner(TypeOfContract typeOfContract) {
        typeOfContract.setDate(new Date());
        return typeOfContractMapper.inner(typeOfContract);
    }
}
