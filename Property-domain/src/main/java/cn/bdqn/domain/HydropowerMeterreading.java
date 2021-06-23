package cn.bdqn.domain;

import java.util.Date;

//水电抄表
public class HydropowerMeterreading {
    //id
    private Integer id;
    //关联房屋表
    private House houseId;
    //关联项目表
    private ReadingCharge readingChargeId;
    //缴费类型id
    private Integer tableTypeId;
    //关联缴费类型
    private TableType tableType;
    //上期度数
    private Double degreeOfPreviousPeriod;
    //本期度数
    private Double currentDegree;
    //本期费用
    private Double currentExpenses;
    //上期费用
    private Double previousPeriodExpenses;
    //上期读取时间
    private Date readingTimeOfLastIssue;
    //本期读取时间
    private Date readingTimeOfThisIssue;
    //创建时间
    private Date creationTime;
    //是否发送短信
    private Integer isSend;
    //备注
    private String desc;


    @Override
    public String toString() {
        return "HydropowerMeterreading{" +
                "id=" + id +
                ", houseId=" + houseId +
                ", readingChargeId=" + readingChargeId +
                ", tableTypeId=" + tableTypeId +
                ", tableType=" + tableType +
                ", degreeOfPreviousPeriod=" + degreeOfPreviousPeriod +
                ", currentDegree=" + currentDegree +
                ", currentExpenses=" + currentExpenses +
                ", previousPeriodExpenses=" + previousPeriodExpenses +
                ", readingTimeOfLastIssue=" + readingTimeOfLastIssue +
                ", readingTimeOfThisIssue=" + readingTimeOfThisIssue +
                ", creationTime=" + creationTime +
                ", isSend=" + isSend +
                ", desc='" + desc + '\'' +
                '}';
    }

    public House getHouseId() {
        return houseId;
    }

    public void setHouseId(House houseId) {
        this.houseId = houseId;
    }

    public ReadingCharge getReadingChargeId() {
        return readingChargeId;
    }

    public void setReadingChargeId(ReadingCharge readingChargeId) {
        this.readingChargeId = readingChargeId;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableTypeId() {
        return tableTypeId;
    }

    public void setTableTypeId(Integer tableTypeId) {
        this.tableTypeId = tableTypeId;
    }

    public TableType getTableType() {
        return tableType;
    }

    public void setTableType(TableType tableType) {
        this.tableType = tableType;
    }

    public Double getDegreeOfPreviousPeriod() {
        return degreeOfPreviousPeriod;
    }

    public void setDegreeOfPreviousPeriod(Double degreeOfPreviousPeriod) {
        this.degreeOfPreviousPeriod = degreeOfPreviousPeriod;
    }
    public Double getCurrentDegree() {
        return currentDegree;
    }

    public void setCurrentDegree(Double currentDegree) {
        this.currentDegree = currentDegree;
    }

    public Double getCurrentExpenses() {
        return currentExpenses;
    }

    public void setCurrentExpenses(Double currentExpenses) {
        this.currentExpenses = currentExpenses;
    }

    public Double getPreviousPeriodExpenses() {
        return previousPeriodExpenses;
    }

    public void setPreviousPeriodExpenses(Double previousPeriodExpenses) {
        this.previousPeriodExpenses = previousPeriodExpenses;
    }

    public Date getReadingTimeOfLastIssue() {
        return readingTimeOfLastIssue;
    }

    public void setReadingTimeOfLastIssue(Date readingTimeOfLastIssue) {
        this.readingTimeOfLastIssue = readingTimeOfLastIssue;
    }

    public Date getReadingTimeOfThisIssue() {
        return readingTimeOfThisIssue;
    }

    public void setReadingTimeOfThisIssue(Date readingTimeOfThisIssue) {
        this.readingTimeOfThisIssue = readingTimeOfThisIssue;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
