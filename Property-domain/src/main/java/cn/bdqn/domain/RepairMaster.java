package cn.bdqn.domain;

import java.util.Date;

//报修师傅
public class RepairMaster {
    //id
    private Integer id;
    //报修类型
    private String repairType;
    //状态
    private RepairState repairStateId;
    //说明
    private String illustrate;
    //创建时间
    private Date creationTime;
    //报修师傅
    private String name;

    @Override
    public String toString() {
        return "RepairMaster{" +
                "id=" + id +
                ", repairType='" + repairType + '\'' +
                ", repairStateId=" + repairStateId +
                ", illustrate='" + illustrate + '\'' +
                ", creation_time=" + creationTime +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public RepairState getRepairStateId() {
        return repairStateId;
    }

    public void setRepairStateId(RepairState repairStateId) {
        this.repairStateId = repairStateId;
    }

    public String getIllustrate() {
        return illustrate;
    }

    public void setIllustrate(String illustrate) {
        this.illustrate = illustrate;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
