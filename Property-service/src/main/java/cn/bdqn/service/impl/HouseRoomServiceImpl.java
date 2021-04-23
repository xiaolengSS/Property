package cn.bdqn.service.impl;

import cn.bdqn.domain.HouseTypeRoom;
import cn.bdqn.mapper.HouseRoomMapper;
import cn.bdqn.service.HouseRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("houseRoomService")
public class HouseRoomServiceImpl implements HouseRoomService {

    @Autowired
    private HouseRoomMapper houseRoomMapper;

    //查询全部几室
    @Override
    public List<HouseTypeRoom> queryAllByRoom() {
        return houseRoomMapper.selectAllTypeRooom();
    }

}
