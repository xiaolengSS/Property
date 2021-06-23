package cn.bdqn.mapper;

import cn.bdqn.domain.House;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMapper {

    //根据id查询房屋信息
    public House houseById(@Param("id") Integer id);

    //根据房屋信息模糊查询房屋信息
    public List<House> selectByHouse(House house);

    //根据房屋编号删除房屋信息
    public void deleteByHouse(@Param("numberId") String housenumberID);

    //根据房屋编号修改房屋信息
    public void updateByHouse(House house);

    //添加房屋信息
    public void insertByHouse(House house);

    //房屋解绑 id:业主id
    public Integer updateByHousehoUnbundle(Integer id);

    //房屋绑定 id:业主id houseId：房屋ID
    public Integer updateByHousehoBind(@Param("id") Integer id,@Param("houseId") Integer houseId);

    //根据楼栋、单元、房屋条件进行查询其下数据;水电抄表需调用
    public List<House> selectByFloorAndUintAndHouse(House house);
}