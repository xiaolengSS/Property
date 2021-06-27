package cn.bdqn.domain;

//报修师傅状态
public class RepairState {
    //id
    private Integer id;
    //状态
    private String stateName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "RepairState{" +
                "id=" + id +
                ", stateName='" + stateName + '\'' +
                '}';
    }
}
