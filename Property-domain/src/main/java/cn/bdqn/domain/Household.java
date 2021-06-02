package cn.bdqn.domain;

//业主
public class Household {
    //id
    private Integer id;
    //姓名
    private String name;
    //电话号
    private String phone;
    //身份证号
    private String idNumber;
    //关联房屋
    private House house;
    //关联重点关怀人员
    private Integer keyCared;
    //QQ
    private Integer qq;
    //门禁钥匙
    private Integer accessKey;
    //创建人
    private String creator;
    //业主年龄
    private Integer age;
    //业主性别
    private String sex;
    //小区ID
    private Integer communityId;
    //关联小区
    private Community community;
    //头像
    private String headPortrait;
    //备注
    private String remarks;

    @Override
    public String toString() {
        return "Household{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", house=" + house +
                ", keyCared=" + keyCared +
                ", qq=" + qq +
                ", accessKey=" + accessKey +
                ", creator='" + creator + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", communityId=" + communityId +
                ", community=" + community +
                ", headPortrait='" + headPortrait + '\'' +
                ", remarks='" + remarks + '\'' +
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Integer getKeyCared() {
        return keyCared;
    }

    public void setKeyCared(Integer keyCared) {
        this.keyCared = keyCared;
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public Integer getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(Integer accessKey) {
        this.accessKey = accessKey;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
