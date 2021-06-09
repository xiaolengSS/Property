package cn.bdqn.domain;

//(组织)部门信息
public class DepartmentInformation {
    //id
    private Integer id;
    //组织id--上级组织(公司)
    private CompanyInformation companyInformationId;
    //部门组织名称
    private String name;
    //组织部门级别
    private String organizationLevelDepartment;
    //描述
    private String describe;

    @Override
    public String toString() {
        return "DepartmentInformation{" +
                "id=" + id +
                ", companyInformationId=" + companyInformationId +
                ", name='" + name + '\'' +
                ", organizationLevelDepartment='" + organizationLevelDepartment + '\'' +
                ", describe='" + describe + '\'' +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationLevelDepartment() {
        return organizationLevelDepartment;
    }

    public void setOrganizationLevelDepartment(String organizationLevelDepartment) {
        this.organizationLevelDepartment = organizationLevelDepartment;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
