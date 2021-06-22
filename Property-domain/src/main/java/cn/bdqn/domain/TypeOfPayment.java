package cn.bdqn.domain;

//付费类型
public class TypeOfPayment {
    //id
    private Integer id;
    //付费类型
    private String typeOfPaymentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeOfPaymentName() {
        return typeOfPaymentName;
    }

    public void setTypeOfPaymentName(String typeOfPaymentName) {
        this.typeOfPaymentName = typeOfPaymentName;
    }

    @Override
    public String toString() {
        return "TypeOfPayment{" +
                "id=" + id +
                ", typeOfPaymentName='" + typeOfPaymentName + '\'' +
                '}';
    }
}
