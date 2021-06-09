package cn.bdqn.domain;

//投诉类型
public class TypeOfComplaints {
    //id
    private Integer id;
    //投诉类型
    private String type;

    @Override
    public String toString() {
        return "TypeOfComplaints{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

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
}
