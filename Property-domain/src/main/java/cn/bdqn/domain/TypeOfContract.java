package cn.bdqn.domain;

import java.util.Date;

//合同类型
public class TypeOfContract {
    //合同类型id
    private Integer id;
    //类型名称/合同类型名称
    private String typeName;
    //是否审核
    private ContractReview contractReviewId;
    //描述
    private String describe;
    //创建时间
    private Date date;

    @Override
    public String toString() {
        return "TypeOfContract{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", contractReviewId=" + contractReviewId +
                ", describe='" + describe + '\'' +
                ", date=" + date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ContractReview getContractReviewId() {
        return contractReviewId;
    }

    public void setContractReviewId(ContractReview contractReviewId) {
        this.contractReviewId = contractReviewId;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
