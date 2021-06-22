package cn.bdqn.domain;
//催缴周期
public class TypeOfCollection {
    //id
    private Integer id;
    //催缴周期
    private String typeOfCollectionName;

    @Override
    public String toString() {
        return "TypeOfCollection{" +
                "id=" + id +
                ", typeOfCollectionName='" + typeOfCollectionName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeOfCollectionName() {
        return typeOfCollectionName;
    }

    public void setTypeOfCollectionName(String typeOfCollectionName) {
        this.typeOfCollectionName = typeOfCollectionName;
    }
}
