package cn.bdqn.domain;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Date;

//电话投诉
public class ComplaintOnThePhone {
    //id
    private Integer id;
    //关联房屋
    private House houseId;
    //关联楼栋
    private Floor floorId;
    //投诉类型
    private TypeOfComplaints typesOfComplaintsId;
    //投诉人
    private String complainants;
    //投诉电话
    private String phone;
    //投诉内容
    private String complaintText;
    //创建时间
    private Date creationTime;
    //状态（0：处理中，1：处理完成）
    private Integer state;
    //处理人(员工)
    private  EmployeeInformation employeeInformationId;
    //处理时间
    private Date processingTime;
    //耗时
    private String timeConsuming;
    //意见
    private String opinion;

    @Override
    public String toString() {
        return "ComplaintOnThePhone{" +
                "id=" + id +
                ", houseId=" + houseId +
                ", floorId=" + floorId +
                ", typesOfComplaintsId=" + typesOfComplaintsId +
                ", complainants='" + complainants + '\'' +
                ", phone='" + phone + '\'' +
                ", complaintText='" + complaintText + '\'' +
                ", creationTime=" + creationTime +
                ", state=" + state +
                ", employeeInformationId=" + employeeInformationId +
                ", processingTime=" + processingTime +
                ", timeConsuming='" + timeConsuming + '\'' +
                ", opinion='" + opinion + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public House getHouseId() {
        return houseId;
    }

    public void setHouseId(House houseId) {
        this.houseId = houseId;
    }

    public Floor getFloorId() {
        return floorId;
    }

    public void setFloorId(Floor floorId) {
        this.floorId = floorId;
    }

    public TypeOfComplaints getTypesOfComplaintsId() {
        return typesOfComplaintsId;
    }

    public void setTypesOfComplaintsId(TypeOfComplaints typesOfComplaintsId) {
        this.typesOfComplaintsId = typesOfComplaintsId;
    }

    public String getComplainants() {
        return complainants;
    }

    public void setComplainants(String complainants) {
        this.complainants = complainants;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComplaintText() {
        return complaintText;
    }

    public void setComplaintText(String complaintText) {
        this.complaintText = complaintText;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public EmployeeInformation getEmployeeInformationId() {
        return employeeInformationId;
    }

    public void setEmployeeInformationId(EmployeeInformation employeeInformationId) {
        this.employeeInformationId = employeeInformationId;
    }

    public Date getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Date processingTime) {
        this.processingTime = processingTime;
    }

    public String getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
