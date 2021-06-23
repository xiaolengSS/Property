package cn.bdqn.mapper;

import cn.bdqn.domain.TableType;

import java.util.List;

//水电缴费类型
public interface TableTypeMapper {

    //查询全部水电缴费类型
    public List<TableType> selectAllTableType();

}
