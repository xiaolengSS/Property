package cn.bdqn.domain;

//停车收费项目
public class PayService {
    //id
    private Integer id;
    //收费项目名称
    private String name;
    //单价
    private Double unitPrice;
    //固定费
    private Double fixedFee;
    //收费范围
    private RangeOfChargesVehicle rangeOfChargesVehicleId;

    @Override
    public String toString() {
        return "PayService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", fixedFee=" + fixedFee +
                ", rangeOfChargesVehicleId=" + rangeOfChargesVehicleId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(Double fixedFee) {
        this.fixedFee = fixedFee;
    }

    public RangeOfChargesVehicle getRangeOfChargesVehicleId() {
        return rangeOfChargesVehicleId;
    }

    public void setRangeOfChargesVehicleId(RangeOfChargesVehicle rangeOfChargesVehicleId) {
        this.rangeOfChargesVehicleId = rangeOfChargesVehicleId;
    }
}
