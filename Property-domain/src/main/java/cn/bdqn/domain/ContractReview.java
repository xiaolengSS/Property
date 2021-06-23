package cn.bdqn.domain;

//是否审核
public class ContractReview {
    //id
    private Integer id;

    @Override
    public String toString() {
        return "contractReview{" +
                "id=" + id +
                ", contract='" + contract + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    //类型审核
    private String contract;

}
