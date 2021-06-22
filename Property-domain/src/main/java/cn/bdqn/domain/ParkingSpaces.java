package cn.bdqn.domain;

//车位类型
public class ParkingSpaces {
    //id
    private Integer id;
    //车位类型
    private String typename;

    @Override
    public String toString() {
        return "ParkingSpaces{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
