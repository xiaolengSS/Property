package cn.bdqn.service;

import cn.bdqn.domain.Floor;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangcong
 * @date 2021/4/9 -14:09
 */
public interface FloorService {

    //多属性查询带分页和查询全部带分页
    public PageInfo<Floor> queryAllByFloor(Floor floor, Integer currentPage, Integer pageSize);

    //删除楼栋
    public int deleteById(Integer id);

    //修改楼栋信息
    public int updateByFloor(Floor floor);

    //添加楼栋
    public int saveFloor(Floor floor);


    //查询有没有重复数据
    public Integer queryById(Integer floorId);

    //查询全部楼栋；根据楼栋编号查询楼栋下的所有楼栋
    public List<Floor> queryByFloorId(Integer floorId);

    //李欣玉的代码
    ////查询全部
    public Floor queryByFloorId2(Integer floorId);


}
