package cn.bdqn.domain;

//(组织)公司信息
public class CompanyInformation {
    //id
    private Integer id;
    //组织名称
    private String name;
    //组织级别
    private String organizationLevel;
    //上级组织
    private String computerOrganization;
    //描述
    private String describe;

    @Override
    public String toString() {
        return "CompanyInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", organizationLevel='" + organizationLevel + '\'' +
                ", computerOrganization='" + computerOrganization + '\'' +
                ", describe='" + describe + '\'' +
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

    public String getOrganizationLevel() {
        return organizationLevel;
    }

    public void setOrganizationLevel(String organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    public String getComputerOrganization() {
        return computerOrganization;
    }

    public void setComputerOrganization(String computerOrganization) {
        this.computerOrganization = computerOrganization;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
