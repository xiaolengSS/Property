package cn.bdqn.domain;

import java.util.Date;

//业主车辆
public class OwnersVehicle {
    //id
    private Integer id;
    //车牌号
    private String licensePlateNumber;
    //车品牌
    private String carBrand;
    //车类型
    private VehicleType vehicleTypeId;
    //颜色
    private String colour;
    //车牌类型
    private PlateType plateTypeId;
    //备注
    private String remarks;
    //起租时间
    private Date startingTime;
    //结租时间
    private Date closingTime;
    //关联业主
    private Household houserholdId;
    //关联状态
    private OwnersVehicleState ownersVehicleStateId;
    //关联车位
    private ParkingInformation parkingInformationId;

    @Override
    public String toString() {
        return "OwnersVehicle{" +
                "id=" + id +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", vehicleTypeId=" + vehicleTypeId +
                ", colour='" + colour + '\'' +
                ", plateTypeId=" + plateTypeId +
                ", remarks='" + remarks + '\'' +
                ", startingTime=" + startingTime +
                ", closingTime=" + closingTime +
                ", houserholdId=" + houserholdId +
                ", ownersVehicleStateId=" + ownersVehicleStateId +
                ", parkingInformationId=" + parkingInformationId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public VehicleType getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(VehicleType vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public PlateType getPlateTypeId() {
        return plateTypeId;
    }

    public void setPlateTypeId(PlateType plateTypeId) {
        this.plateTypeId = plateTypeId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    public Household getHouserholdId() {
        return houserholdId;
    }

    public void setHouserholdId(Household houserholdId) {
        this.houserholdId = houserholdId;
    }

    public OwnersVehicleState getOwnersVehicleStateId() {
        return ownersVehicleStateId;
    }

    public void setOwnersVehicleStateId(OwnersVehicleState ownersVehicleStateId) {
        this.ownersVehicleStateId = ownersVehicleStateId;
    }

    public ParkingInformation getParkingInformationId() {
        return parkingInformationId;
    }

    public void setParkingInformationId(ParkingInformation parkingInformationId) {
        this.parkingInformationId = parkingInformationId;
    }
}
