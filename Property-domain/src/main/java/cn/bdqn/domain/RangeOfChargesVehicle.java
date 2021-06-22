package cn.bdqn.domain;

//停车场收费范围
public class RangeOfChargesVehicle {
    //id
    private Integer id;
    //收费范围
    private String name;

    @Override
    public String toString() {
        return "RangeOfChargesVehicle{" +
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
