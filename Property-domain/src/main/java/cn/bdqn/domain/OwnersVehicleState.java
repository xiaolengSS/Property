package cn.bdqn.domain;
//业主车辆状态
public class OwnersVehicleState {
    //id
    private Integer id;
    //状态
    private String state;

    @Override
    public String toString() {
        return "OwnersVehicleState{" +
                "id=" + id +
                ", state='" + state + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
