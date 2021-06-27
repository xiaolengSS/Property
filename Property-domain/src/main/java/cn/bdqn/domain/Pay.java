package cn.bdqn.domain;

//缴费
public class Pay {
    //id
    private Integer id;
    //金额
    private Double amountOfMoney;
    //支付方式
    private  PaymentMethod paymentMethodId;
    //房屋
    private House houseId;
    //备注
    private String remarks;

    @Override
    public String toString() {
        return "Pay{" +
                "id=" + id +
                ", amountOfMoney=" + amountOfMoney +
                ", paymentMethodId=" + paymentMethodId +
                ", houseId=" + houseId +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public PaymentMethod getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(PaymentMethod paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public House getHouseId() {
        return houseId;
    }

    public void setHouseId(House houseId) {
        this.houseId = houseId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
