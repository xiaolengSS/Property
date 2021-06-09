package cn.bdqn.domain;

//回访设置
public class BackVisitSettings {
    //id
    private Integer id;
    //回访设置
    private String backVisitSettingsName;

    @Override
    public String toString() {
        return "BackVisitSettings{" +
                "id=" + id +
                ", backVisitSettingsName='" + backVisitSettingsName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBackVisitSettingsName() {
        return backVisitSettingsName;
    }

    public void setBackVisitSettingsName(String backVisitSettingsName) {
        this.backVisitSettingsName = backVisitSettingsName;
    }
}
