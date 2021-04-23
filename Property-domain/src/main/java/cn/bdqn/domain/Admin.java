package cn.bdqn.domain;

public class Admin {
    //id
    private  Integer id;
    //用户名
    private  String userName;
    //密码
    private  String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public String toString() {
        return "admin{" +
                "id=" + id +
                ", username='" + userName    + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
