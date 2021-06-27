package cn.bdqn.domain;

import java.util.Date;

//电话报修
public class Repair {
    //id
    private Integer id;
    //位置
    private String location;
    //报修类型
    private TypeOfRepair typeOfRepairId;
    //报修人
    private String repairName;
    //联系方式
    private String repairPhone;
    //预约时间
    private Date appointmentTime;
    //状态
    private StatusOfTheRepair statusOfTheRepairId;
    //保修内容
    private String reportTheContents;
    //关联房屋表
    private House houseId;
    //关联单元表
    private Unit unitId;
    //关联楼栋表
    private Floor floorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TypeOfRepair getTypeOfRepairId() {
        return typeOfRepairId;
    }

    public void setTypeOfRepairId(TypeOfRepair typeOfRepairId) {
        this.typeOfRepairId = typeOfRepairId;
    }

    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName;
    }

    public String getRepairPhone() {
        return repairPhone;
    }

    public void setRepairPhone(String repairPhone) {
        this.repairPhone = repairPhone;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public StatusOfTheRepair getStatusOfTheRepairId() {
        return statusOfTheRepairId;
    }

    public void setStatusOfTheRepairId(StatusOfTheRepair statusOfTheRepairId) {
        this.statusOfTheRepairId = statusOfTheRepairId;
    }

    public String getReportTheContents() {
        return reportTheContents;
    }

    public void setReportTheContents(String reportTheContents) {
        this.reportTheContents = reportTheContents;
    }

    public House getHouseId() {
        return houseId;
    }

    public void setHouseId(House houseId) {
        this.houseId = houseId;
    }

    public Unit getUnitId() {
        return unitId;
    }

    public void setUnitId(Unit unitId) {
        this.unitId = unitId;
    }

    public Floor getFloorId() {
        return floorId;
    }

    public void setFloorId(Floor floorId) {
        this.floorId = floorId;
    }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", typeOfRepairId=" + typeOfRepairId +
                ", repairName='" + repairName + '\'' +
                ", repairPhone='" + repairPhone + '\'' +
                ", appointmentTime=" + appointmentTime +
                ", statusOfTheRepairId=" + statusOfTheRepairId +
                ", reportTheContents='" + reportTheContents + '\'' +
                ", houseId=" + houseId +
                ", unitId=" + unitId +
                ", floorId=" + floorId +
                '}';
    }
}
