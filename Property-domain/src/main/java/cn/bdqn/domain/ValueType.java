package cn.bdqn.domain;

//值类型
public class ValueType {
    //id
    private Integer id;
    //值类型
    private String name;

    @Override
    public String toString() {
        return "ValueType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
