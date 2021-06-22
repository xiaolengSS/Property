package cn.bdqn.domain;

//托收信息
public class CollectionInformation {
    //id
    private Integer id;
    //房屋名称
    private String name_of_house;
    //业主名称
    private String owners_name;
    //业主电话
    private String owners_phone;
    //房屋面积
    private Double size_of_the_house;
    //托收金额
    private Double collection_amount;
    //状态  0(已取走) 1(托收中)
    private Integer state;
    //备注
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_of_house() {
        return name_of_house;
    }

    public void setName_of_house(String name_of_house) {
        this.name_of_house = name_of_house;
    }

    public String getOwners_name() {
        return owners_name;
    }

    public void setOwners_name(String owners_name) {
        this.owners_name = owners_name;
    }

    public String getOwners_phone() {
        return owners_phone;
    }

    public void setOwners_phone(String owners_phone) {
        this.owners_phone = owners_phone;
    }

    public Double getSize_of_the_house() {
        return size_of_the_house;
    }

    public void setSize_of_the_house(Double size_of_the_house) {
        this.size_of_the_house = size_of_the_house;
    }

    public Double getCollection_amount() {
        return collection_amount;
    }

    public void setCollection_amount(Double collection_amount) {
        this.collection_amount = collection_amount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CollectionInformation{" +
                "id=" + id +
                ", name_of_house='" + name_of_house + '\'' +
                ", owners_name='" + owners_name + '\'' +
                ", owners_phone='" + owners_phone + '\'' +
                ", size_of_the_house=" + size_of_the_house +
                ", collection_amount=" + collection_amount +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                '}';
    }
}
