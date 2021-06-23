package cn.bdqn.domain;
//车辆费用类型
public class VehicleExpensesType {
    //id
    private Integer id;
    //车辆费用类型
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VehicleExpensesType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
