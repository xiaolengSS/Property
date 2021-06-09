package cn.bdqn.domain;

//派单方式
public class Dispatch {
    //id
    private Integer id;
    //派单
    private String name;

    @Override
    public String toString() {
        return "Dispatch{" +
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
