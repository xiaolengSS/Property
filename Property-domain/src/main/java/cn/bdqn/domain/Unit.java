package cn.bdqn.domain;


public class Unit {

    //ID
    private Integer id;
    //楼栋名称
    private Integer floorId;
    //单元号
    private Integer unitNumber;
    //总层数
    private Integer unitFloors;
    //建筑面积
    private double unitArea;
    //是否有电梯
    private Integer unitLift;
    //创建人
    private String unitCreator;
    //备注
    private String unitRemarks;
    //楼栋表
    private Floor floor;

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

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Integer getUnitFloors() {
        return unitFloors;
    }

    public void setUnitFloors(Integer unitFloors) {
        this.unitFloors = unitFloors;
    }

    public Double getUnitArea() {
        return unitArea;
    }

    public void setUnitArea(Double unitArea) {
        this.unitArea = unitArea;
    }

    public Integer getUnitLift() {
        return unitLift;
    }

    public void setUnitLift(Integer unitLift) {
        this.unitLift = unitLift;
    }

    public String getUnitCreator() {
        return unitCreator;
    }

    public void setUnitCreator(String unitCreator) {
        this.unitCreator = unitCreator;
    }

    public String getUnitRemarks() {
        return unitRemarks;
    }

    public void setUnitRemarks(String unitRemarks) {
        this.unitRemarks = unitRemarks;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", floorId=" + floorId +
                ", unitNumber=" + unitNumber +
                ", unitFloors=" + unitFloors +
                ", unitArea=" + unitArea +
                ", unitLift=" + unitLift +
                ", unitCreator='" + unitCreator + '\'' +
                ", unitRemarks='" + unitRemarks + '\'' +
                '}';
    }
}
