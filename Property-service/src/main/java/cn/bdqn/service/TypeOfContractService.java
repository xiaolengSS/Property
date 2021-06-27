package cn.bdqn.service;

import cn.bdqn.domain.InformationOfCaringPersonnel;
import cn.bdqn.domain.TypeOfContract;

import java.util.List;

public interface TypeOfContractService {
    //查询所有
    public List<TypeOfContract> selectAll();

    //添加
    public Integer inner(TypeOfContract typeOfContract);

}
