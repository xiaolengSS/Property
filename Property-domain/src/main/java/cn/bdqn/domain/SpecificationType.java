package cn.bdqn.domain;

//规格类型
public class SpecificationType {
    //id
    private Integer id;
    //规格类型
    private String typeSpecification;

    @Override
    public String toString() {
        return "SpecificationType{" +
                "id=" + id +
                ", typeSpecification='" + typeSpecification + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeSpecification() {
        return typeSpecification;
    }

    public void setTypeSpecification(String typeSpecification) {
        this.typeSpecification = typeSpecification;
    }
}
