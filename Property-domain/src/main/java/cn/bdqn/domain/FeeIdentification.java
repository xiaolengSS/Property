package cn.bdqn.domain;

//费用标识
public class FeeIdentification {
    //id
    private  Integer id;
    //费用标识
    private String feeIdentificationName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeeIdentificationName() {
        return feeIdentificationName;
    }

    public void setFeeIdentificationName(String feeIdentificationName) {
        this.feeIdentificationName = feeIdentificationName;
    }

    @Override
    public String toString() {
        return "FeeIdentification{" +
                "id=" + id +
                ", feeIdentificationName='" + feeIdentificationName + '\'' +
                '}';
    }
}
