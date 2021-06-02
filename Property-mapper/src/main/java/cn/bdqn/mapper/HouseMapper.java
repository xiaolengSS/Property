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
}
