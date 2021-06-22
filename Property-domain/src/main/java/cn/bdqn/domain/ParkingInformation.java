package cn.bdqn.domain;

//车位信息
public class ParkingInformation {
    //id
    private Integer id;
    //车位编号
    private Integer parking_number;
    //停车场
    private PrkingManagement prkingManagementId;
    //车位类型
    private ParkingSpaces parkingSpacesId;
    //车位面积
    private Double measureOfArea;
    //备注
    private String remarks;
    //停车位状态
    private ParkingStatus parkingStatusId;

    @Override
    public String toString() {
        return "ParkingInformation{" +
                "id=" + id +
                ", parking_number=" + parking_number +
                ", prkingManagementId=" + prkingManagementId +
                ", parkingSpacesId=" + parkingSpacesId +
                ", measureOfArea=" + measureOfArea +
                ", remarks='" + remarks + '\'' +
                ", parkingStatusId=" + parkingStatusId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParking_number() {
        return parking_number;
    }

    public void setParking_number(Integer parking_number) {
        this.parking_number = parking_number;
    }

    public PrkingManagement getPrkingManagementId() {
        return prkingManagementId;
    }

    public void setPrkingManagementId(PrkingManagement prkingManagementId) {
        this.prkingManagementId = prkingManagementId;
    }

    public ParkingSpaces getParkingSpacesId() {
        return parkingSpacesId;
    }

    public void setParkingSpacesId(ParkingSpaces parkingSpacesId) {
        this.parkingSpacesId = parkingSpacesId;
    }

    public Double getMeasureOfArea() {
        return measureOfArea;
    }

    public void setMeasureOfArea(Double measureOfArea) {
        this.measureOfArea = measureOfArea;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ParkingStatus getParkingStatusId() {
        return parkingStatusId;
    }

    public void setParkingStatusId(ParkingStatus parkingStatusId) {
        this.parkingStatusId = parkingStatusId;
    }
}
