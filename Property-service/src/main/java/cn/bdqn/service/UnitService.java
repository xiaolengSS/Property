package cn.bdqn.service;

import cn.bdqn.domain.Floor;
import cn.bdqn.domain.Unit;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UnitService {

    //根据楼栋查询单元；根据多条件查询单元
    public List<Unit> queryByUnit(Unit unit);

    //根据单元id修改单元
    public void updateUnit(Unit unit);

    //根据id删除单元
    public void deleteUnit(Integer id);

    //新增单元
    public void saveUnit(Unit unit);

    //判断单元是否存在
    public int judgeUnit(Integer unitNumber);


    //李欣玉的代码
    //根据单元名称查询单元
    public Unit queryByUnitNumber(Integer unitNumber);

    //查询全部单元
    public List<Unit> queryAllUnit();

    //根据楼栋编号查询单元信息
    public Unit queryUnitByFloorId(Integer floorId);



}
