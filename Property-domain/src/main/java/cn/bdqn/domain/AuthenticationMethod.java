package cn.bdqn.domain;
//员工认证方式
public class AuthenticationMethod {
    //员工认证方式id
    private Integer id;
    //认证方式
    private String name;
    //认证二维码
    private String authenticationQrCode;

    @Override
    public String toString() {
        return "AuthenticationMethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authenticationQrCode='" + authenticationQrCode + '\'' +
                '}';
    }

    public String getAuthenticationQrCode() {
        return authenticationQrCode;
    }

    public void setAuthenticationQrCode(String authenticationQrCode) {
        this.authenticationQrCode = authenticationQrCode;
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
}
