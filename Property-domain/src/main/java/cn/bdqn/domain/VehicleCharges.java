package cn.bdqn.domain;

import java.util.Date;

//车辆收费
public class VehicleCharges {
    //id
    private Integer id;
    //关联收费范围
    private RangeOfCharges rangeOfChargesId;
    //关联车辆费用类型
    private VehicleExpensesType vehicleExpensesTypeId;
    //关联停车场
    private PrkingManagement prkingManagementId;
    //收费项目
    private PayService payServiceId;
    //车位状态
    private ParkingStatusCharges parkingStatusChargesId;
    //计费起始时间
    private Date billingStartTime;
    //计费结束时间
    private Date end_start_time;
    //业主车辆
    private OwnersVehicle ownersVehicleId;

    @Override
    public String toString() {
        return "VehicleCharges{" +
                "id=" + id +
                ", rangeOfChargesId=" + rangeOfChargesId +
                ", vehicleExpensesTypeId=" + vehicleExpensesTypeId +
                ", prkingManagementId=" + prkingManagementId +
                ", payServiceId=" + payServiceId +
                ", parkingStatusChargesId=" + parkingStatusChargesId +
                ", billingStartTime=" + billingStartTime +
                ", end_start_time=" + end_start_time +
                ", ownersVehicleId=" + ownersVehicleId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RangeOfCharges getRangeOfChargesId() {
        return rangeOfChargesId;
    }

    public void setRangeOfChargesId(RangeOfCharges rangeOfChargesId) {
        this.rangeOfChargesId = rangeOfChargesId;
    }

    public VehicleExpensesType getVehicleExpensesTypeId() {
        return vehicleExpensesTypeId;
    }

    public void setVehicleExpensesTypeId(VehicleExpensesType vehicleExpensesTypeId) {
        this.vehicleExpensesTypeId = vehicleExpensesTypeId;
    }

    public PrkingManagement getPrkingManagementId() {
        return prkingManagementId;
    }

    public void setPrkingManagementId(PrkingManagement prkingManagementId) {
        this.prkingManagementId = prkingManagementId;
    }

    public PayService getPayServiceId() {
        return payServiceId;
    }

    public void setPayServiceId(PayService payServiceId) {
        this.payServiceId = payServiceId;
    }

    public ParkingStatusCharges getParkingStatusChargesId() {
        return parkingStatusChargesId;
    }

    public void setParkingStatusChargesId(ParkingStatusCharges parkingStatusChargesId) {
        this.parkingStatusChargesId = parkingStatusChargesId;
    }

    public Date getBillingStartTime() {
        return billingStartTime;
    }

    public void setBillingStartTime(Date billingStartTime) {
        this.billingStartTime = billingStartTime;
    }

    public Date getEnd_start_time() {
        return end_start_time;
    }

    public void setEnd_start_time(Date end_start_time) {
        this.end_start_time = end_start_time;
    }

    public OwnersVehicle getOwnersVehicleId() {
        return ownersVehicleId;
    }

    public void setOwnersVehicleId(OwnersVehicle ownersVehicleId) {
        this.ownersVehicleId = ownersVehicleId;
    }
}
