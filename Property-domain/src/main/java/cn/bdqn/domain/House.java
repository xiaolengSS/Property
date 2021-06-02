package cn.bdqn.domain;

//房屋表
public class House {

    //id
    private Integer id;

    //业主id
    private Integer householdId;

    //房屋编号
    private String numberId;

    //几室id
    private Integer roomId;

    //几厅id
    private Integer officeId;

    //房屋面积
    private Double squaremetre;

    //单元id
    private Integer uintId;

    //楼栋id
    private Integer floorId;

    //房间号
    private String houseNumberId;

    //楼层
    private Integer housetFloor;

    //算费系数
    private Double housetcalculation;

    //房屋状态
    private Integer housingStatusId;

    //房屋备注
    private String desc;

    //关联几厅表
    private HouseTypeOffice houseTypeOffice;

    //关联几室表
    private HouseTypeRoom houseTypeRoom;

    //关联房屋状态表
    private HousingStatus housingStatus;

    //关联单元表
    private Unit unit;

    //关联楼栋表
    private Floor floor;


    public HouseTypeRoom getHouseTypeRoom() {
        return houseTypeRoom;
    }

    public void setHouseTypeRoom(HouseTypeRoom houseTypeRoom) {
        this.houseTypeRoom = houseTypeRoom;
    }

    public HousingStatus getHousingStatus() {
        return housingStatus;
    }

    public void setHousingStatus(HousingStatus housingStatus) {
        this.housingStatus = housingStatus;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public HouseTypeOffice getHouseTypeOffice() {
        return houseTypeOffice;
    }

    public void setHouseTypeOffice(HouseTypeOffice houseTypeOffice) {
        this.houseTypeOffice = houseTypeOffice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public Double getSquaremetre() {
        return squaremetre;
    }

    public void setSquaremetre(Double squaremetre) {
        this.squaremetre = squaremetre;
    }

    public Integer getUintId() {
        return uintId;
    }

    public void setUintId(Integer uintId) {
        this.uintId = uintId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public String getHouseNumberId() {
        return houseNumberId;
    }

    public void setHouseNumberId(String houseNumberId) {
        this.houseNumberId = houseNumberId;
    }

    public Integer getHousetFloor() {
        return housetFloor;
    }

    public void setHousetFloor(Integer housetFloor) {
        this.housetFloor = housetFloor;
    }

    public Double getHousetcalculation() {
        return housetcalculation;
    }

    public void setHousetcalculation(Double housetcalculation) {
        this.housetcalculation = housetcalculation;
    }

    public Integer getHousingStatusId() {
        return housingStatusId;
    }

    public void setHousingStatusId(Integer housingStatusId) {
        this.housingStatusId = housingStatusId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", numberId='" + numberId + '\'' +
                ", roomId=" + roomId +
                ", officeId=" + officeId +
                ", squaremetre=" + squaremetre +
                ", uintId=" + uintId +
                ", floorId=" + floorId +
                ", houseNumberId='" + houseNumberId + '\'' +
                ", housetFloor=" + housetFloor +
                ", housetcalculation=" + housetcalculation +
                ", housingStatusId=" + housingStatusId +
                ", desc='" + desc + '\'' +
                ", houseTypeOffice=" + houseTypeOffice +
                ", houseTypeRoom=" + houseTypeRoom +
                ", housingStatus=" + housingStatus +
                ", unit=" + unit +
                ", floor=" + floor +
                '}';
    }
}
