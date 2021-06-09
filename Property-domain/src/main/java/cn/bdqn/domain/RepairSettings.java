package cn.bdqn.domain;

import java.util.Date;

//报修设置
public class RepairSettings {
    //id
    private Integer id;
    //类型名称
    private String name;
    //派单方式
    private Dispatch dispatchId;
    //公共区域（0是 1否）
    private Integer commonAreas;
    //回访设置
    private BackVisitSettings backVisitSettingsId;
    //说明
    private String explain;
    //创建时间
    private Date creationTime;
    //派单类型（随机数）
    private String dispatchType;

    @Override
    public String toString() {
        return "RepairSettings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dispatchId=" + dispatchId +
                ", commonAreas=" + commonAreas +
                ", backVisitSettingsId=" + backVisitSettingsId +
                ", explain='" + explain + '\'' +
                ", creation_time=" + creationTime +
                ", dispatchType='" + dispatchType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dispatch getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Dispatch dispatchId) {
        this.dispatchId = dispatchId;
    }

    public Integer getCommonAreas() {
        return commonAreas;
    }

    public void setCommonAreas(Integer commonAreas) {
        this.commonAreas = commonAreas;
    }

    public BackVisitSettings getBackVisitSettingsId() {
        return backVisitSettingsId;
    }

    public void setBackVisitSettingsId(BackVisitSettings backVisitSettingsId) {
        this.backVisitSettingsId = backVisitSettingsId;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getDispatchType() {
        return dispatchType;
    }

    public void setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType;
    }
}
