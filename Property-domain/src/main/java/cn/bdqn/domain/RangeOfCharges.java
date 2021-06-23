package cn.bdqn.domain;

//收费范围
public class RangeOfCharges {
    //id
    private  Integer id;
    //收费范围
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
        return "RangeOfCharges{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
