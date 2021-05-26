package cn.bdqn.domain;

//小区
public class Community {
    //id
    private Integer communityId;
    //小区名称
    private String communityName;
    //小区所属市
    private String communityCity;
    //小区所属区/县
    private String communityCounty;
    //小区编码
    private Integer communityEncode;
    //联系方式
    private String communityPhone;
    //小区面积
    private String communityArea;
    //小区状态
    private Integer communityState;

    @Override
    public String toString() {
        return "Community{" +
                "communityId=" + communityId +
                ", communityName='" + communityName + '\'' +
                ", communityCity='" + communityCity + '\'' +
                ", communityCounty='" + communityCounty + '\'' +
                ", communityEncode=" + communityEncode +
                ", communityPhone='" + communityPhone + '\'' +
                ", communityArea='" + communityArea + '\'' +
                ", communityState=" + communityState +
                '}';
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityCity() {
        return communityCity;
    }

    public void setCommunityCity(String communityCity) {
        this.communityCity = communityCity;
    }

    public String getCommunityCounty() {
        return communityCounty;
    }

    public void setCommunityCounty(String communityCounty) {
        this.communityCounty = communityCounty;
    }

    public Integer getCommunityEncode() {
        return communityEncode;
    }

    public void setCommunityEncode(Integer communityEncode) {
        this.communityEncode = communityEncode;
    }

    public String getCommunityPhone() {
        return communityPhone;
    }

    public void setCommunityPhone(String communityPhone) {
        this.communityPhone = communityPhone;
    }

    public String getCommunityArea() {
        return communityArea;
    }

    public void setCommunityArea(String communityArea) {
        this.communityArea = communityArea;
    }

    public Integer getCommunityState() {
        return communityState;
    }

    public void setCommunityState(Integer communityState) {
        this.communityState = communityState;
    }
}
