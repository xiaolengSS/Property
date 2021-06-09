package cn.bdqn.domain;

//报修类型，如果添加报修，就会把名字添加进来
public class TypeOfRepair {
    //id
    private Integer id;
    //报修类型
    private String name;

    @Override
    public String toString() {
        return "TypeOfRepair{" +
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
