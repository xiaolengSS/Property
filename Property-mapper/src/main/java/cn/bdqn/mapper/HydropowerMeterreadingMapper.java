package cn.bdqn.mapper;

import cn.bdqn.domain.HydropowerMeterreading;

import java.util.List;

//水电查表
public interface HydropowerMeterreadingMapper {

    //查询全部信息/根据条件查询
    public List<HydropowerMeterreading> selectAllByWhere(HydropowerMeterreading hydropowerMeterreading);

    //根据id查询信息
    public HydropowerMeterreading selectById(Integer id);

    //根据id修改信息
    public void updateById(HydropowerMeterreading hydropowerMeterreading);

    //根据id删除信息
    public void deleteById(Integer id);

    //查询单条上期数据
    public HydropowerMeterreading selectByLimit(Integer houseId);

}
