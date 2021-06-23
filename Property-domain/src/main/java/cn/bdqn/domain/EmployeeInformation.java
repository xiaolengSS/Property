package cn.bdqn.domain;

import java.util.Date;

//员工
public class EmployeeInformation {
    //id
    private Integer id;
    //关联公司id
    private CompanyInformation companyInformationId;
    //(组织)部门信息id
    private String departmentInformation;
    //员工名称
    private String name;
    //员工性别
    private String sex;
    //员工岗位
    private String employeePosition;
    //员工邮箱
    private String employeeEmail;
    //手机号
    private String phone;
    //家庭地址
    private String address;
    //照片
    private String photo;

    @Override
    public String toString() {
        return "EmployeeInformation{" +
                "id=" + id +
                ", companyInformationId=" + companyInformationId +
                ", departmentInformation='" + departmentInformation + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CompanyInformation getCompanyInformationId() {
        return companyInformationId;
    }

    public void setCompanyInformationId(CompanyInformation companyInformationId) {
        this.companyInformationId = companyInformationId;
    }

    public String getDepartmentInformation() {
        return departmentInformation;
    }

    public void setDepartmentInformation(String departmentInformation) {
        this.departmentInformation = departmentInformation;
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

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
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
