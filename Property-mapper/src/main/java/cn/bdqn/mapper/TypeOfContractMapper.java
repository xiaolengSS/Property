package cn.bdqn.mapper;

import cn.bdqn.domain.TypeOfContract;

import java.util.List;

//合同类型Mapper
public interface TypeOfContractMapper {
    //查询所有
    public List<TypeOfContract> selectAll();

    //添加
    public Integer inner(TypeOfContract typeOfContract);

    //删除

}
