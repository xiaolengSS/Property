package cn.bdqn.domain;

import java.util.Date;

//收银台
public class Cashier {
    //id
    private Integer id;
    //关联车辆收费表
    private VehicleCharges vehicleChargesId;
    //到期时间
    private Date dueDate;
    //缴费周期
    private PaymentCycle paymentCycleId;
    //备注
    private String remarks;
    //支付方式
    private PaymentMethod paymentMethodId;
    //实收款
    private Double actualCollection;

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                ", vehicleChargesId=" + vehicleChargesId +
                ", dueDate=" + dueDate +
                ", paymentCycleId=" + paymentCycleId +
                ", remarks='" + remarks + '\'' +
                ", paymentMethodId=" + paymentMethodId +
                ", actualCollection=" + actualCollection +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VehicleCharges getVehicleChargesId() {
        return vehicleChargesId;
    }

    public void setVehicleChargesId(VehicleCharges vehicleChargesId) {
        this.vehicleChargesId = vehicleChargesId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public PaymentCycle getPaymentCycleId() {
        return paymentCycleId;
    }

    public void setPaymentCycleId(PaymentCycle paymentCycleId) {
        this.paymentCycleId = paymentCycleId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public PaymentMethod getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(PaymentMethod paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Double getActualCollection() {
        return actualCollection;
    }

    public void setActualCollection(Double actualCollection) {
        this.actualCollection = actualCollection;
    }
}
