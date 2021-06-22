package cn.bdqn.domain;

//车牌类型
public class PlateType {
    //id
    private Integer id;
    //车牌类型
    private String plateTypeName;

    @Override
    public String toString() {
        return "PlateType{" +
                "id=" + id +
                ", plateTypeName='" + plateTypeName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlateTypeName() {
        return plateTypeName;
    }

    public void setPlateTypeName(String plateTypeName) {
        this.plateTypeName = plateTypeName;
    }
}
