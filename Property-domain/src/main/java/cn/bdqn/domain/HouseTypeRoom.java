package cn.bdqn.domain;

import java.util.List;

//室表
public class HouseTypeRoom {

    //id
    private Integer id;

    //几室
    private String roomName;

    //关联房屋表
    private List<House> houseList;

    @Override
    public String toString() {
        return "HouseTypeRoom{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", houseList=" + houseList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
}
