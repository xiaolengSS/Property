package cn.bdqn.domain;

import java.util.Date;

//停车场
public class PrkingManagement {
    //id
    private Integer id;
    //停车场编号
    private Integer number;
    //停车场类型
    private TypePrking typePrkingId;
    //外部编号
    private Integer externalNumber;
    //日期
    private Date prkingDate;
    //备注
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public TypePrking getTypePrkingId() {
        return typePrkingId;
    }

    public void setTypePrkingId(TypePrking typePrkingId) {
        this.typePrkingId = typePrkingId;
    }

    public Integer getExternalNumber() {
        return externalNumber;
    }

    public void setExternalNumber(Integer externalNumber) {
        this.externalNumber = externalNumber;
    }

    public Date getPrkingDate() {
        return prkingDate;
    }

    public void setPrkingDate(Date prkingDate) {
        this.prkingDate = prkingDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "PrkingManagement{" +
                "id=" + id +
                ", number=" + number +
                ", typePrkingId=" + typePrkingId +
                ", externalNumber=" + externalNumber +
                ", prkingDate=" + prkingDate +
                ", remark='" + remark + '\'' +
                '}';
    }
}
