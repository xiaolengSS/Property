package cn.bdqn.domain;

//重点关怀人员信息
public class InformationOfCaringPersonnel {
    //重点关怀人员信息id
    private Integer id;
    //人员姓名
    private String nameOfPersonnel;
    //身份证号
    private String number;
    //年龄
    private Integer age;
    //手机号
    private String phone;

    @Override
    public String toString() {
        return "InformationOfCaringPersonnel{" +
                "id=" + id +
                ", nameOfPersonnel='" + nameOfPersonnel + '\'' +
                ", number='" + number + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfPersonnel() {
        return nameOfPersonnel;
    }

    public void setNameOfPersonnel(String nameOfPersonnel) {
        this.nameOfPersonnel = nameOfPersonnel;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
