package cn.bdqn.domain;

import java.util.Date;
import java.util.List;

//起草合同
public class DraftContract {
    //id
    private Integer id;
    //起草名称
    private String contractName;
    //合同编号
    private String contractNo;
    //合同类型
    private TypeOfContract typeOfContractId;
    //合同甲方
    private PartyA partyAId;
    //乙方/业主表
    private Household householdId;
    //经办人
    private String agent;
    //经办人联系电话
    private String phone;
    //合同金额
    private Double contractAmount;
    //开始时间
    private Date startTime;
    //结束时间
    private Date endTime;
    //签订时间
    private Date signingTime;
    //合同附件
    private List<AppendicesOfAContract> appendicesOfAContractId;
    //关联房屋
    private House houseId;

    @Override
    public String toString() {
        return "DraftContract{" +
                "id=" + id +
                ", contractName='" + contractName + '\'' +
                ", contractNo='" + contractNo + '\'' +
                ", typeOfContractId=" + typeOfContractId +
                ", partyAId=" + partyAId +
                ", householdId=" + householdId +
                ", agent='" + agent + '\'' +
                ", phone='" + phone + '\'' +
                ", contractAmount=" + contractAmount +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", signingTime=" + signingTime +
                ", appendicesOfAContractId=" + appendicesOfAContractId +
                ", houseId=" + houseId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public TypeOfContract getTypeOfContractId() {
        return typeOfContractId;
    }

    public void setTypeOfContractId(TypeOfContract typeOfContractId) {
        this.typeOfContractId = typeOfContractId;
    }

    public PartyA getPartyAId() {
        return partyAId;
    }

    public void setPartyAId(PartyA partyAId) {
        this.partyAId = partyAId;
    }

    public Household getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Household householdId) {
        this.householdId = householdId;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getSigningTime() {
        return signingTime;
    }

    public void setSigningTime(Date signingTime) {
        this.signingTime = signingTime;
    }

    public List<AppendicesOfAContract> getAppendicesOfAContractId() {
        return appendicesOfAContractId;
    }

    public void setAppendicesOfAContractId(List<AppendicesOfAContract> appendicesOfAContractId) {
        this.appendicesOfAContractId = appendicesOfAContractId;
    }

    public House getHouseId() {
        return houseId;
    }

    public void setHouseId(House houseId) {
        this.houseId = houseId;
    }
}
