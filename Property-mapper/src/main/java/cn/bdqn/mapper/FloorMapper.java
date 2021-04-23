package cn.bdqn.mapper;

import cn.bdqn.domain.Floor;
import cn.bdqn.domain.Unit;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * @author zhangcong
 * @date 2021/4/9 -13:51
 */
public interface FloorMapper {


    //根据要求查询信息
    public List<Floor> selectAllByFloor(Floor floor);

    //删除楼栋
    public int deleteById(Integer id);

    //修改楼栋信息
    public int updateByFloor(Floor floor);

    //添加楼栋
    public int insertFloor(Floor floor);

    //查询有没有重复数据
    public Integer selectById(Integer floorId);

    //查询全部楼栋；根据楼栋编号查询楼栋
    public List<Floor> selectAllByFloorId(@Param("floorId") Integer floorId);

    //根据floorId查询楼栋信息
    public Floor selectByFloorId(Integer floorId);




}
