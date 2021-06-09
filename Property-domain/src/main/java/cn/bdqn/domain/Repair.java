package cn.bdqn.domain;

import java.util.Date;

//电话报修
public class Repair {
    //id
    private Integer id;
    //位置
    private String location;
    //报修类型
    private TypeOfRepair typeOfRepairId;
    //报修人
    private String repairName;
    //联系方式
    private String repairPhone;
    //预约时间
    private Date appointmentTime;
    //状态
    private StatusOfTheRepair statusOfTheRepairId;
    //保修内容
    private String reportTheContents;
    //关联房屋表
    private House houseId;
    //关联单元表
    private Unit unitId;
    //关联楼栋表
    private Floor floorId;

}
