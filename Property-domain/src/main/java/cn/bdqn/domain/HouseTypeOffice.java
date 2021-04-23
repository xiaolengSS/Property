package cn.bdqn.domain;

import java.util.List;
//厅
public class HouseTypeOffice {
    //id
    private Integer id;

    //几厅
    private String officeName;

    //关联房屋表
    private List<House> houseList;

    @Override
    public String toString() {
        return "HouseTypeOffice{" +
                "id=" + id +
                ", officeName='" + officeName + '\'' +
                ", houseList=" + houseList +
                '}';
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}
