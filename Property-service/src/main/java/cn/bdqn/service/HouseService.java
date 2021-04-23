package cn.bdqn.service;

import cn.bdqn.domain.House;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface HouseService {

    public List<House> houseQueryAll();

    //根据房屋id查询房屋信息
    public House houseQueryById(Integer id);

    //根据房屋编号删除房屋信息
    public void houseDelete(String housenumberID);

    //根据房屋编号修改房屋信息
    public void houseUpdate(House house);

    //添加房屋信息
    public void houseSave(House house);

    // 带分页查询全部
    public PageInfo<House> queryAllByPageHouse(Integer currentPage, Integer pageSize);


    // 带分页查询的模糊查询
    public PageInfo<House> queryAllByPageAndHouse(Integer currentPage, Integer pageSize, House house);





}
