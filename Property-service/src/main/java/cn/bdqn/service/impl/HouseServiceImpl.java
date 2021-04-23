package cn.bdqn.service.impl;

import cn.bdqn.domain.House;
import cn.bdqn.mapper.HouseMapper;
import cn.bdqn.service.HouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("houseService")
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;


    //查询全部的房屋信息
    @Override
    public List<House> houseQueryAll() {
        House house = null;
        return houseMapper.selectByHouse(house);
    }

    //根据id查询房屋信息
    @Override
    public House houseQueryById(Integer id) {
        return houseMapper.houseById(id);
    }

    //根据房屋编号查询房屋信息
    @Override
    public void houseDelete(String housenumberID) {
        houseMapper.deleteByHouse(housenumberID);
    }

    //修改房屋信息
    @Override
    public void houseUpdate(House house) {
        houseMapper.updateByHouse(house);
    }

    //添加房屋信息
    @Override
    @Transactional
    public void houseSave(House house) {
        houseMapper.insertByHouse(house);
    }

    //分页显示全部
    @Override
    public PageInfo<House> queryAllByPageHouse(Integer currentPage, Integer pageSize) {

        House house = null;

        PageHelper.startPage(currentPage,pageSize);
        List<House> houses = houseMapper.selectByHouse(house);

        PageInfo<House> pageInfo = new PageInfo<House>(houses);


        return pageInfo;
    }

    //带分页查询的模糊查询
    @Override
    public PageInfo<House> queryAllByPageAndHouse(Integer currentPage, Integer pageSize, House house) {

        PageHelper.startPage(currentPage,pageSize);
        List<House> houses = houseMapper.selectByHouse(house);

        PageInfo<House> pageInfo = new PageInfo<House>(houses);

        return pageInfo;
    }

}
