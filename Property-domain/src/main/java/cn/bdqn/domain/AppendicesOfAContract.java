package cn.bdqn.domain;

//合同附件
public class AppendicesOfAContract {
    //id
    private Integer id;
    //附件
    private String appendicesOfAContractCame;

    @Override
    public String toString() {
        return "AppendicesOfAContract{" +
                "id=" + id +
                ", appendicesOfAContractCame='" + appendicesOfAContractCame + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppendicesOfAContractCame() {
        return appendicesOfAContractCame;
    }

    public void setAppendicesOfAContractCame(String appendicesOfAContractCame) {
        this.appendicesOfAContractCame = appendicesOfAContractCame;
    }
}
