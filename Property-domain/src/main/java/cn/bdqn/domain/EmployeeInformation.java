package cn.bdqn.domain;

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
                '}';
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
