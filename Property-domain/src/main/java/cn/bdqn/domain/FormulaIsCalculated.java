package cn.bdqn.domain;

//计算公式
public class FormulaIsCalculated {
    //id
    private Integer id;
    //公式
    private String formulaIsCalculatedName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormulaIsCalculatedName() {
        return formulaIsCalculatedName;
    }

    public void setFormulaIsCalculatedName(String formulaIsCalculatedName) {
        this.formulaIsCalculatedName = formulaIsCalculatedName;
    }

    @Override
    public String toString() {
        return "FormulaIsCalculated{" +
                "id=" + id +
                ", formulaIsCalculatedName='" + formulaIsCalculatedName + '\'' +
                '}';
    }
}
