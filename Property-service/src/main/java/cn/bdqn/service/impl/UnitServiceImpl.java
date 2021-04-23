package cn.bdqn.service.impl;

import cn.bdqn.domain.Floor;
import cn.bdqn.domain.Unit;
import cn.bdqn.mapper.UnitMapper;
import cn.bdqn.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitMapper unitMapper;

    //根据楼栋查询单元；根据多条件查询单元
    @Override
    public List<Unit> queryByUnit(Unit unit) {
        return unitMapper.selectAllByUnit(unit);
    }

    //根据单元id修改单元
    @Override
    public void updateUnit(Unit unit) {
        unitMapper.updateUnit(unit);
    }

    //根据id删除单元
    @Override
    public void deleteUnit(Integer id) {
        unitMapper.deleteUnit(id);
    }

    //新增单元
    @Override
    public void saveUnit(Unit unit) {
        unitMapper.insertUnit(unit);
    }

    @Override
    public int judgeUnit(Integer unitNumber) {
        return unitMapper.whereUnit(unitNumber);
    }


    //根据单元名称查询单元信息
    @Override
    public Unit queryByUnitNumber(Integer unitNumber) {
        return unitMapper.selectUnitByUnitName(unitNumber);
    }

    //查询全部单元信息
    @Override
    public List<Unit> queryAllUnit() {
        return unitMapper.selectAllUnit();
    }

    //根据楼栋编号查询楼栋信息
    @Override
    public Unit queryUnitByFloorId(Integer floorId) {
        return unitMapper.selectUnitByFloorId(floorId);
    }

}
