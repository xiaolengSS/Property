package cn.bdqn.service;

import cn.bdqn.domain.HouseTypeRoom;

import java.util.List;

public interface HouseRoomService {

    //查询全部几室
    public List<HouseTypeRoom> queryAllByRoom();

}
