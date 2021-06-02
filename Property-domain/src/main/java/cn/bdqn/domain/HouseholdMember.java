package cn.bdqn.domain;


public class HouseholdMember {

    private Integer theOwnerId;//成员id

    private String theOwnerName;//成员名称

    private Integer householdId;//业主id

    private Integer  theOwnerAge;//成员年龄

    private String theOwnerSex;//成员性别

    private Integer theOwnerTypeId;//类型

    private String theOwnerIdentityCard;//身份证

    private String theOwnerContactInformation;//手机号码

    private String theOwnerCreate;//创建员工

    private String theOwnerRemark;//备注

    private String theOwnerRemarkPhoto;//成员照片

    private Integer accessKey;//门禁钥匙

    private String qq;//QQ

    private TheOwnerType theOwnerType;//成员类型表

    public Integer getTheOwnerId() {
        return theOwnerId;
    }

    public void setTheOwnerId(Integer theOwnerId) {
        this.theOwnerId = theOwnerId;
    }

    public String getTheOwnerName() {
        return theOwnerName;
    }

    public void setTheOwnerName(String theOwnerName) {
        this.theOwnerName = theOwnerName;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public Integer getTheOwnerAge() {
        return theOwnerAge;
    }

    public void setTheOwnerAge(Integer theOwnerAge) {
        this.theOwnerAge = theOwnerAge;
    }

    public String getTheOwnerSex() {
        return theOwnerSex;
    }

    public void setTheOwnerSex(String theOwnerSex) {
        this.theOwnerSex = theOwnerSex;
    }

    public Integer getTheOwnerTypeId() {
        return theOwnerTypeId;
    }

    public void setTheOwnerTypeId(Integer theOwnerTypeId) {
        this.theOwnerTypeId = theOwnerTypeId;
    }

    public String getTheOwnerIdentityCard() {
        return theOwnerIdentityCard;
    }

    public void setTheOwnerIdentityCard(String theOwnerIdentityCard) {
        this.theOwnerIdentityCard = theOwnerIdentityCard;
    }

    public String getTheOwnerContactInformation() {
        return theOwnerContactInformation;
    }

    public void setTheOwnerContactInformation(String theOwnerContactInformation) {
        this.theOwnerContactInformation = theOwnerContactInformation;
    }

    public String getTheOwnerCreate() {
        return theOwnerCreate;
    }

    public void setTheOwnerCreate(String theOwnerCreate) {
        this.theOwnerCreate = theOwnerCreate;
    }

    public String getTheOwnerRemark() {
        return theOwnerRemark;
    }

    public void setTheOwnerRemark(String theOwnerRemark) {
        this.theOwnerRemark = theOwnerRemark;
    }

    public String getTheOwnerRemarkPhoto() {
        return theOwnerRemarkPhoto;
    }

    public void setTheOwnerRemarkPhoto(String theOwnerRemarkPhoto) {
        this.theOwnerRemarkPhoto = theOwnerRemarkPhoto;
    }

    public TheOwnerType getTheOwnerType() {
        return theOwnerType;
    }

    public void setTheOwnerType(TheOwnerType theOwnerType) {
        this.theOwnerType = theOwnerType;
    }

    public Integer getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(Integer accessKey) {
        this.accessKey = accessKey;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        return "HouseholdMember{" +
                "theOwnerId=" + theOwnerId +
                ", theOwnerName='" + theOwnerName + '\'' +
                ", householdId=" + householdId +
                ", theOwnerAge=" + theOwnerAge +
                ", theOwnerSex='" + theOwnerSex + '\'' +
                ", theOwnerTypeId=" + theOwnerTypeId +
                ", theOwnerIdentityCard='" + theOwnerIdentityCard + '\'' +
                ", theOwnerContactInformation='" + theOwnerContactInformation + '\'' +
                ", theOwnerCreate='" + theOwnerCreate + '\'' +
                ", theOwnerRemark='" + theOwnerRemark + '\'' +
                ", theOwnerRemarkPhoto='" + theOwnerRemarkPhoto + '\'' +
                ", accessKey=" + accessKey +
                ", qq='" + qq + '\'' +
                ", theOwnerType=" + theOwnerType +
                '}';
    }
}
