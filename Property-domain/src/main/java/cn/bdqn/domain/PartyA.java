package cn.bdqn.domain;

//甲方
public class PartyA {
    //合同甲方id/甲方编号
    private Integer id;
    //甲方
    private String party;
    //甲方联系人
    private String partyName;
    //甲方联系人电话
    private String partyPhone;

    @Override
    public String toString() {
        return "PartyA{" +
                "id=" + id +
                ", party='" + party + '\'' +
                ", partyName='" + partyName + '\'' +
                ", partyPhone='" + partyPhone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyPhone() {
        return partyPhone;
    }

    public void setPartyPhone(String partyPhone) {
        this.partyPhone = partyPhone;
    }
}
