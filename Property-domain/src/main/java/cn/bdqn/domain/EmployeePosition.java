package cn.bdqn.domain;

//员工岗位
public class EmployeePosition {
    //id
    private Integer id;
    //员工岗位
    private String name;

    @Override
    public String toString() {
        return "EmployeePosition{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
}
