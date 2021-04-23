package cn.bdqn.service.impl;

import cn.bdqn.domain.Floor;
import cn.bdqn.domain.House;
import cn.bdqn.domain.Unit;
import cn.bdqn.mapper.FloorMapper;
import cn.bdqn.service.FloorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangcong
 * @date 2021/4/9 -14:10
 */

@Service
public class FloorServiceImpl implements FloorService {

    @Autowired
    private FloorMapper floorMapper;


    ////多属性查询带分页和查询全部带分页
    @Override
    public PageInfo<Floor> queryAllByFloor(Floor floor, Integer currentPage, Integer pageSize) {

        PageHelper.startPage(currentPage,pageSize);
        List<Floor> floors = floorMapper.selectAllByFloor(floor);

        PageInfo<Floor> pageInfo = new PageInfo<Floor>(floors);

        return pageInfo;
    }

    ////根据floorId查询楼栋信息
    @Override
    public Floor queryByFloorId2(Integer floorId) {

        return floorMapper.selectByFloorId(floorId);
    }

    //根据id删除楼栋
    @Override
    public int deleteById(Integer id) {

        return floorMapper.deleteById(id);
    }

    //根据请求修改楼栋
    @Override
    public int updateByFloor(Floor floor) {
        return floorMapper.updateByFloor(floor);
    }


    //添加楼栋
    @Override
    public int saveFloor(Floor floor) {
        return floorMapper.insertFloor(floor);
    }

    @Override
    public Integer queryById(Integer floorId) {
        return floorMapper.selectById(floorId);
    }

    //查询全部单元；根据楼栋编号查询楼栋下的所有单元
    @Override
    public List<Floor> queryByFloorId(Integer floorId) {
        return floorMapper.selectAllByFloorId(floorId);
    }

}
