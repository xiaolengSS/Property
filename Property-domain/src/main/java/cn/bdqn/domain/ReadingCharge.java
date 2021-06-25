package cn.bdqn.domain;

//水电抄表项目
public class ReadingCharge {
    //id
    private Integer id;
    //项目名称
     private String name;
    //关联缴费类型表
    private TableType tableTypeId;

    @Override
    public String toString() {
        return "ReadingCharge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tableTypeId=" + tableTypeId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableType getTableTypeId() {
        return tableTypeId;
    }

    public void setTableTypeId(TableType tableTypeId) {
        this.tableTypeId = tableTypeId;
    }
}
