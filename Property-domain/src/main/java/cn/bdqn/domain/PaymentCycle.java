package cn.bdqn.domain;

//缴费周期
public class PaymentCycle {
    //id
    private Integer id;
    //缴费周期
    private String name;

    @Override
    public String toString() {
        return "PaymentCycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
}
