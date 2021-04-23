package cn.bdqn.domain;

public class Floor {
    //ID
    private Integer id;
    //楼栋编号
    private Integer floorId;
    //楼栋名称
    private String floorName;
    //建筑面积
    private double floorArea;
    //创建员工
    private String floorCreator;
    //备注
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public double getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(double floorArea) {
        this.floorArea = floorArea;
    }

    public String getFloorCreator() {
        return floorCreator;
    }

    public void setFloorCreator(String floorCreator) {
        this.floorCreator = floorCreator;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "id=" + id +
                ", floorId=" + floorId +
                ", floorName='" + floorName + '\'' +
                ", floorArea=" + floorArea +
                ", floorCreator='" + floorCreator + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
