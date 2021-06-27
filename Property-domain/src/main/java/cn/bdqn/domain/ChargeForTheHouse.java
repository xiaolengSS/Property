package cn.bdqn.domain;

import java.util.Date;

//房屋收费
public class ChargeForTheHouse {
    //id
    private Integer id;
    //关联房屋收费类型
    private TypeOfHouse typeOfHouseId;
    //关联房屋
    private House houseId;
    //关联收费范围
    private RangeOfCharges rangeOfChargesId;
    //关联费用类型
    private TheTypeOfFee theTypeOfFeeId;
    //关联收费项目类型
    private PayService payServiceId;
    //房屋状态
    private HousingStatus housingStatusId;
    //计费起始时间
    private Date start_time;
    //计费终止时间
    private Date end_time;
    //欠费金额
    private Double amount_owed;

    @Override
    public String toString() {
        return "ChargeForTheHouse{" +
                "id=" + id +
                ", typeOfHouseId=" + typeOfHouseId +
                ", houseId=" + houseId +
                ", rangeOfChargesId=" + rangeOfChargesId +
                ", theTypeOfFeeId=" + theTypeOfFeeId +
                ", payServiceId=" + payServiceId +
                ", housingStatusId=" + housingStatusId +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", amount_owed=" + amount_owed +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypeOfHouse getTypeOfHouseId() {
        return typeOfHouseId;
    }

    public void setTypeOfHouseId(TypeOfHouse typeOfHouseId) {
        this.typeOfHouseId = typeOfHouseId;
    }

    public House getHouseId() {
        return houseId;
    }

    public void setHouseId(House houseId) {
        this.houseId = houseId;
    }

    public RangeOfCharges getRangeOfChargesId() {
        return rangeOfChargesId;
    }

    public void setRangeOfChargesId(RangeOfCharges rangeOfChargesId) {
        this.rangeOfChargesId = rangeOfChargesId;
    }

    public TheTypeOfFee getTheTypeOfFeeId() {
        return theTypeOfFeeId;
    }

    public void setTheTypeOfFeeId(TheTypeOfFee theTypeOfFeeId) {
        this.theTypeOfFeeId = theTypeOfFeeId;
    }

    public PayService getPayServiceId() {
        return payServiceId;
    }

    public void setPayServiceId(PayService payServiceId) {
        this.payServiceId = payServiceId;
    }

    public HousingStatus getHousingStatusId() {
        return housingStatusId;
    }

    public void setHousingStatusId(HousingStatus housingStatusId) {
        this.housingStatusId = housingStatusId;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Double getAmount_owed() {
        return amount_owed;
    }

    public void setAmount_owed(Double amount_owed) {
        this.amount_owed = amount_owed;
    }
}
