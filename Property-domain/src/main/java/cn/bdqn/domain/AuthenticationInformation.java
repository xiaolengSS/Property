package cn.bdqn.domain;

import java.util.Date;

//员工认证
public class AuthenticationInformation {
    //id
    private Integer id;
    //认证方式
    private String method;
    //认证名称
    private String name;
    //认证id
    private String idid;
    //认证状态
    private Integer status;
    //认证时间
    private Date certificationTime;
    //关联员工信息表
    private EmployeeInformation employeeInformationId;

    @Override
    public String toString() {
        return "AuthenticationInformation{" +
                "id=" + id +
                ", method='" + method + '\'' +
                ", name='" + name + '\'' +
                ", idid='" + idid + '\'' +
                ", status=" + status +
                ", certificationTime=" + certificationTime +
                ", employeeInformationId=" + employeeInformationId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdid() {
        return idid;
    }

    public void setIdid(String idid) {
        this.idid = idid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCertificationTime() {
        return certificationTime;
    }

    public void setCertificationTime(Date certificationTime) {
        this.certificationTime = certificationTime;
    }

    public EmployeeInformation getEmployeeInformationId() {
        return employeeInformationId;
    }

    public void setEmployeeInformationId(EmployeeInformation employeeInformationId) {
        this.employeeInformationId = employeeInformationId;
    }
}
