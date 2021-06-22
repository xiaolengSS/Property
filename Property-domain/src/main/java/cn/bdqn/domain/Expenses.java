package cn.bdqn.domain;

import java.util.Date;

//费用项设置
public class Expenses {
    //id
    private Integer id;
    //关联费用类型
    private TheTypeOfFee theTypeOfFeeId;
    //收费项目
    private String charges;
    //关联费用标识
    private FeeIdentification feeIdentificationId;
    //关联付费类型
    private TypeOfPayment typeOfPaymentId;
    //缴费周期
    private Integer paymentPeriod;
    //关联催缴类型
    private TypeOfCollection typeOfCollectionId;
    //计费起始时间
    private Date billingStartTime;
    //计费终止时间
    private Date BillingEndTime;
    //关联计算公式
    private FormulaIsCalculated formulaIsCalculatedId;
    //计费单价
    private Double calculateUnitPrice;
    //附加费用
    private Double additionalCharges;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TheTypeOfFee getTheTypeOfFeeId() {
        return theTypeOfFeeId;
    }

    public void setTheTypeOfFeeId(TheTypeOfFee theTypeOfFeeId) {
        this.theTypeOfFeeId = theTypeOfFeeId;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public FeeIdentification getFeeIdentificationId() {
        return feeIdentificationId;
    }

    public void setFeeIdentificationId(FeeIdentification feeIdentificationId) {
        this.feeIdentificationId = feeIdentificationId;
    }

    public TypeOfPayment getTypeOfPaymentId() {
        return typeOfPaymentId;
    }

    public void setTypeOfPaymentId(TypeOfPayment typeOfPaymentId) {
        this.typeOfPaymentId = typeOfPaymentId;
    }

    public Integer getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(Integer paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public TypeOfCollection getTypeOfCollectionId() {
        return typeOfCollectionId;
    }

    public void setTypeOfCollectionId(TypeOfCollection typeOfCollectionId) {
        this.typeOfCollectionId = typeOfCollectionId;
    }

    public Date getBillingStartTime() {
        return billingStartTime;
    }

    public void setBillingStartTime(Date billingStartTime) {
        this.billingStartTime = billingStartTime;
    }

    public Date getBillingEndTime() {
        return BillingEndTime;
    }

    public void setBillingEndTime(Date billingEndTime) {
        BillingEndTime = billingEndTime;
    }

    public FormulaIsCalculated getFormulaIsCalculatedId() {
        return formulaIsCalculatedId;
    }

    public void setFormulaIsCalculatedId(FormulaIsCalculated formulaIsCalculatedId) {
        this.formulaIsCalculatedId = formulaIsCalculatedId;
    }

    public Double getCalculateUnitPrice() {
        return calculateUnitPrice;
    }

    public void setCalculateUnitPrice(Double calculateUnitPrice) {
        this.calculateUnitPrice = calculateUnitPrice;
    }

    public Double getAdditionalCharges() {
        return additionalCharges;
    }

    public void setAdditionalCharges(Double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "id=" + id +
                ", theTypeOfFeeId=" + theTypeOfFeeId +
                ", charges='" + charges + '\'' +
                ", feeIdentificationId=" + feeIdentificationId +
                ", typeOfPaymentId=" + typeOfPaymentId +
                ", paymentPeriod=" + paymentPeriod +
                ", typeOfCollectionId=" + typeOfCollectionId +
                ", billingStartTime=" + billingStartTime +
                ", BillingEndTime=" + BillingEndTime +
                ", formulaIsCalculatedId=" + formulaIsCalculatedId +
                ", calculateUnitPrice=" + calculateUnitPrice +
                ", additionalCharges=" + additionalCharges +
                '}';
    }
}
