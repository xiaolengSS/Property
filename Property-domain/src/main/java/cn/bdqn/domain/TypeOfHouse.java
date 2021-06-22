package cn.bdqn.domain;

//房屋收费类型
public class TypeOfHouse {
    //房屋收费类型id
    private  Integer id;
    //房屋收费类型
    private String name;

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
        return "TypeOfHouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
