package cn.bdqn.service.impl;

import cn.bdqn.domain.ContractReview;
import cn.bdqn.domain.InformationOfCaringPersonnel;
import cn.bdqn.domain.TypeOfContract;
import cn.bdqn.mapper.TypeOfContractMapper;
import cn.bdqn.service.TypeOfContractService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<TypeOfContract> selectAll1(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<TypeOfContract> list = typeOfContractMapper.selectAll();
        PageInfo<TypeOfContract> pageInfo = new PageInfo<TypeOfContract>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<TypeOfContract> selevtAll2(Integer currentPage, Integer pageSize, TypeOfContract typeOfContract) {
        PageHelper.startPage(currentPage,pageSize);
        List<TypeOfContract> list = typeOfContractMapper.selectAllif(typeOfContract);
        PageInfo<TypeOfContract> pageInfo = new PageInfo<TypeOfContract>(list);
        return pageInfo;
    }

    @Override
    public Integer inner(TypeOfContract typeOfContract) {
        typeOfContract.setDate(new Date());
        return typeOfContractMapper.inner(typeOfContract);
    }

    @Override
    public Integer delete(Integer id) {
        return typeOfContractMapper.delete(id);
    }
}
