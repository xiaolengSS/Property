package cn.bdqn.domain;

public class TheOwnerType {

    private Integer id;//成员类型id

    private String name;//成员类型

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

    @Override
    public String toString() {
        return "TheOwnerType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
