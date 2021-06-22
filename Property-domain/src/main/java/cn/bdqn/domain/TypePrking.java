package cn.bdqn.domain;
//停车场类型
public class TypePrking {
    //id
    private Integer id;
    //停车场类型
    private String prkingName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrkingName() {
        return prkingName;
    }

    public void setPrkingName(String prkingName) {
        this.prkingName = prkingName;
    }

    @Override
    public String toString() {
        return "TypePrking{" +
                "id=" + id +
                ", prkingName='" + prkingName + '\'' +
                '}';
    }
}
