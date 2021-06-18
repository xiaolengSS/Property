package cn.bdqn.domain;

import java.util.List;

/**
 * @author zhangcong
 * @date 2021/6/18 -17:19
 */
public class HousingStatus {
    //id
    private Integer housetypeId;

    //房屋状态
    private String housetypeName;

    //关联房屋表
    private List<House> houseList;


    public String getHousetypeName() {
        return housetypeName;
    }

    public void setHousetypeName(String housetypeName) {
        this.housetypeName = housetypeName;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public Integer getHousetypeId() {
        return housetypeId;
    }

    public void setHousetypeId(Integer housetypeId) {
        this.housetypeId = housetypeId;
    }

    @Override
    public String toString() {
        return "HousingStatus{" +
                "housetypeId=" + housetypeId +
                ", housetypeName='" + housetypeName + '\'' +
                ", houseList=" + houseList +
                '}';
    }
}
