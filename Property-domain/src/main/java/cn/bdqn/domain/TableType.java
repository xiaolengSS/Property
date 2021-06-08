package cn.bdqn.domain;

//水电缴费类型
public class TableType {
    //id
    private Integer id;
    //缴费类型
    private String tableTypeName;

    @Override
    public String toString() {
        return "TableType{" +
                "id=" + id +
                ", tableTypeName='" + tableTypeName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTableTypeName() {
        return tableTypeName;
    }

    public void setTableTypeName(String tableTypeName) {
        this.tableTypeName = tableTypeName;
    }
}
