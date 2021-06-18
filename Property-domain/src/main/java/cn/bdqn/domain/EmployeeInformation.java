package cn.bdqn.domain;

import java.util.Date;

//员工
public class EmployeeInformation {
    //id
    private Integer id;
    //(组织)部门信息id
    private DepartmentInformation departmentInformationId;
    //员工名称
    private String name;
    //员工性别
    private String sex;
    //员工岗位
    private EmployeePosition employeePositionId;
    //员工邮箱
    private String employeeEmail;
    //手机号
    private String phone;
    //家庭地址
    private String address;
    //照片
    private String photo;
    //认证方式
    private AuthenticationMethod authenticationMethodId;
    //认证名称
    private String authenticationName;
    //认证id
    private String authenticationId;
    //认证状态（0：已认证，1：未认证）
    private Integer authenticationState;
    //认证时间
    private Date authenticationData;

    @Override
    public String toString() {
        return "EmployeeInformation{" +
                "id=" + id +
                ", departmentInformationId=" + departmentInformationId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", employeePositionId=" + employeePositionId +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", photo='" + photo + '\'' +
                ", authenticationMethodId=" + authenticationMethodId +
                ", authenticationName='" + authenticationName + '\'' +
                ", authenticationId='" + authenticationId + '\'' +
                ", authenticationState=" + authenticationState +
                ", authenticationData=" + authenticationData +
                '}';
    }

    public AuthenticationMethod getAuthenticationMethodId() {
        return authenticationMethodId;
    }

    public void setAuthenticationMethodId(AuthenticationMethod authenticationMethodId) {
        this.authenticationMethodId = authenticationMethodId;
    }

    public String getAuthenticationName() {
        return authenticationName;
    }

    public void setAuthenticationName(String authenticationName) {
        this.authenticationName = authenticationName;
    }

    public String getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    public Integer getAuthenticationState() {
        return authenticationState;
    }

    public void setAuthenticationState(Integer authenticationState) {
        this.authenticationState = authenticationState;
    }

    public Date getAuthenticationData() {
        return authenticationData;
    }

    public void setAuthenticationData(Date authenticationData) {
        this.authenticationData = authenticationData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DepartmentInformation getDepartmentInformationId() {
        return departmentInformationId;
    }

    public void setDepartmentInformationId(DepartmentInformation departmentInformationId) {
        this.departmentInformationId = departmentInformationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public EmployeePosition getEmployeePositionId() {
        return employeePositionId;
    }

    public void setEmployeePositionId(EmployeePosition employeePositionId) {
        this.employeePositionId = employeePositionId;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
