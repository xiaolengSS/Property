package cn.bdqn.domain;

//车类型
public class VehicleType {
    //id
    private Integer id;
    //车类型
    private String vehicleTypeName;

    @Override
    public String toString() {
        return "VehicleType{" +
                "id=" + id +
                ", vehicleTypeName='" + vehicleTypeName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    public void setVehicleTypeName(String vehicleTypeName) {
        this.vehicleTypeName = vehicleTypeName;
    }
}
