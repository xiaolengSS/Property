package cn.bdqn.domain;

//合格类型规范
public class QualificationTypeSpecification {
    //id
    private Integer id;
    //规格名称
    private String specificationname;
    //必填（0：是，1：否）
    private Integer required;
    //展示（0：是，1：否）
    private Integer exhibition;
    //值类型
    private ValueType valueTypeId;
    //规格类型
    private SpecificationType specificationTypeId;
    //查询显示（0：是，1：否）
    private Integer queryDisplay;

    @Override
    public String toString() {
        return "QualificationTypeSpecification{" +
                "id=" + id +
                ", specificationname='" + specificationname + '\'' +
                ", required=" + required +
                ", exhibition=" + exhibition +
                ", valueTypeId=" + valueTypeId +
                ", specificationTypeId=" + specificationTypeId +
                ", queryDisplay=" + queryDisplay +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecificationname() {
        return specificationname;
    }

    public void setSpecificationname(String specificationname) {
        this.specificationname = specificationname;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getExhibition() {
        return exhibition;
    }

    public void setExhibition(Integer exhibition) {
        this.exhibition = exhibition;
    }

    public ValueType getValueTypeId() {
        return valueTypeId;
    }

    public void setValueTypeId(ValueType valueTypeId) {
        this.valueTypeId = valueTypeId;
    }

    public SpecificationType getSpecificationTypeId() {
        return specificationTypeId;
    }

    public void setSpecificationTypeId(SpecificationType specificationTypeId) {
        this.specificationTypeId = specificationTypeId;
    }

    public Integer getQueryDisplay() {
        return queryDisplay;
    }

    public void setQueryDisplay(Integer queryDisplay) {
        this.queryDisplay = queryDisplay;
    }
}
