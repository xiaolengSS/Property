package cn.bdqn.mapper;

import cn.bdqn.domain.Floor;
import cn.bdqn.domain.Unit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnitMapper {

    //根据楼栋查询单元；根据多条件查询单元
    public List<Unit> selectAllByUnit(Unit unit);
    //根据单元id修改单元
    public void updateUnit(Unit unit);
    //根据id删除单元
    public void deleteUnit(Integer id);
    //新增单元
    public void insertUnit(Unit unit);

    //判断单元是否存在
    public int whereUnit(Integer unitNumber);


    //李欣玉的代码-----↓
    //根据单元名称查询单元信息
    public Unit selectUnitByUnitName(@Param("unitNumber")Integer unitNumber);

    //查询全部单元信息
    public List<Unit> selectAllUnit();

    //根据楼栋编号查询单元信息
    public Unit selectUnitByFloorId(@Param("floorId") Integer floorId);


}
