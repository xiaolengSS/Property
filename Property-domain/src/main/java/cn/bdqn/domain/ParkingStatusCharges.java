package cn.bdqn.domain;

//停车场状态
public class ParkingStatusCharges {
    //id
    private Integer id;
    //状态
    private String status;

    @Override
    public String toString() {
        return "ParkingStatusCharges{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
