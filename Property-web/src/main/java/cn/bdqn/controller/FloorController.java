package cn.bdqn.controller;

import cn.bdqn.domain.Floor;
import cn.bdqn.domain.HouseTypeOffice;
import cn.bdqn.domain.HouseTypeRoom;
import cn.bdqn.service.FloorService;
import cn.bdqn.service.HouseOfficeService;
import cn.bdqn.service.HouseRoomService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/floor")
public class FloorController {

    @Autowired
    private FloorService floorService;

    @Autowired
    private HouseOfficeService houseOfficeService;

    @Autowired
    private HouseRoomService houseRoomService;

    //单元表查询楼栋
    //根据传过来的楼层编号查询信息并给前端返回字符串；前端没传默认为0，即为空，查询全部
    @RequestMapping("/queryAllByFloorId")
    @ResponseBody
    public List<Floor> selectAllByFloorId(@RequestParam(value = "floorId",required = false,defaultValue = "0") Integer floorId){

        List<Floor> floors = floorService.queryByFloorId(floorId);

        return floors;
    }


    //带条件的查询楼栋分页，如果没有条件默认值为查询全部楼栋
    @GetMapping("/queryAllByFloor")
    @ResponseBody
    public PageInfo<Floor> queryAllByFloor(@RequestParam(name = "currentPage",required = true,defaultValue = "1") Integer currentPage,Floor floor,HttpServletRequest request){
        //将几室几厅查询出来，带到页面上
        List<HouseTypeOffice> houseOffice = houseOfficeService.queryAllByOffice();
        List<HouseTypeRoom> houseTypeRooms = houseRoomService.queryAllByRoom();
        HttpSession session = request.getSession();
        session.setAttribute("houseOffice",houseOffice);
        session.setAttribute("houseTypeRooms",houseTypeRooms);
        PageInfo<Floor> floorPageInfo = floorService.queryAllByFloor(floor,currentPage,5);
        return floorPageInfo;

    }

    //根据楼栋id删除楼栋
    @GetMapping("/deleteId")
    @ResponseBody
    public int DeleteId(Integer id) {

        int i = floorService.deleteById(id);

        return i;
    }

    //根据楼栋id来修改楼栋信息
    @GetMapping("updateFloor")
    @ResponseBody
    public int updateFloor(Floor floor) {
        Integer i = floorService.updateByFloor(floor);
        return i;
    }


    //保存楼栋信息
    @GetMapping("/saveFloor")
    @ResponseBody
    public int saveFloor(HttpServletRequest request,Floor floor) {
        //从Session拿到创建员工的名字
        HttpSession httpSession= request.getSession();
        String username=(String) httpSession.getAttribute("username");
        floor.setFloorCreator(username);
        Integer count = floorService.queryById(floor.getFloorId());

        //判断是否插入重复数据
        if (count>0){
            //如果有重复数据就返回一个0
            return 0;
        }
        int i = floorService.saveFloor(floor);
        System.out.println("添加成功！"+i);
        return i;
    }

    //做添加房屋操作时的添加楼栋信息，点击保存楼栋实际并未真正保存楼栋
    @RequestMapping("/floorAndHouseSave")
    @ResponseBody
    public String floorAndHouseSave(Floor floor, HttpServletResponse response, HttpServletRequest request)throws Exception{

        //根据floorId查询数据，查看是否存在重复的值
        Floor floor1 = floorService.queryByFloorId2(floor.getFloorId());

        HttpSession session;
        String msg=null;
        if (floor1 == null){
            //如果不重复，将值保留在session中，并返回保存成功！但并未实现保存操作！
            session =  request.getSession();
            session.setAttribute("floor",floor);
            Floor floor2=(Floor) session.getAttribute("floor");
            System.out.println(floor2);
            msg="保存成功！";
        }else {
            msg = "数据冲突，请重新输入！";
        }

        return msg;
    }

}
