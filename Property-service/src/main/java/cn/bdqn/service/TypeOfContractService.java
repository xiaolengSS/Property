package cn.bdqn.service;

import cn.bdqn.domain.InformationOfCaringPersonnel;
import cn.bdqn.domain.TypeOfContract;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TypeOfContractService {
    //查询所有
    public List<TypeOfContract> selectAll();

    //分页查询所有
    public PageInfo<TypeOfContract> selectAll1(Integer currentPage, Integer pageSize);

    //添加
    public Integer inner(TypeOfContract typeOfContract);

    //删除
    public Integer delete(Integer id);

    //根据条件分页查询
    public PageInfo<TypeOfContract> selevtAll2(Integer currentPage, Integer pageSize,TypeOfContract typeOfContract);
}
