package cn.bdqn.mapper;

import cn.bdqn.domain.TheOwnerType;

import java.util.List;

public interface TheOwnerTypeMapper {
    //查询全部业主成员类型
    public List<TheOwnerType> theOwnerTypeselectAll();

}
