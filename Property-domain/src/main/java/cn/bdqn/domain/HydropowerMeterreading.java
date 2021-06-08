package cn.bdqn.domain;

import java.util.Date;

//水电抄表
public class HydropowerMeterreading {
    //id
    private Integer id;
    //对象名称
    private String object_name;
    //关联房屋表
    private House houseId;
    //关联缴费类型
    private TableType tableTypeId;
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
    //备注
    private String desc;

    @Override
    public String toString() {
        return "HydropowerMeterreading{" +
                "id=" + id +
                ", object_name='" + object_name + '\'' +
                ", houseId=" + houseId +
                ", tableTypeId=" + tableTypeId +
                ", degreeOfPreviousPeriod=" + degreeOfPreviousPeriod +
                ", currentDegree=" + currentDegree +
                ", currentExpenses=" + currentExpenses +
                ", previousPeriodExpenses=" + previousPeriodExpenses +
                ", readingTimeOfLastIssue=" + readingTimeOfLastIssue +
                ", readingTimeOfThisIssue=" + readingTimeOfThisIssue +
                ", creationTime=" + creationTime +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name;
    }

    public House getHouseId() {
        return houseId;
    }

    public void setHouseId(House houseId) {
        this.houseId = houseId;
    }

    public TableType getTableTypeId() {
        return tableTypeId;
    }

    public void setTableTypeId(TableType tableTypeId) {
        this.tableTypeId = tableTypeId;
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
