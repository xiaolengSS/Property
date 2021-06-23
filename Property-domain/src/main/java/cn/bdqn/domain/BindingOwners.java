package cn.bdqn.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author zhangcong
 * 业主绑定
 */

@Data
@NoArgsConstructor
public class BindingOwners {
    //绑定业主id
    private Integer bindingOwnersId;

    //业主id
    private Integer househoId;

    //小区id
    private Integer communityId;

    //关联业主
    private String associatedOwnersName;

    //身份证号
    private String identityCard;

    //手机号
    private Integer cellPhoneNumber;

    //状态
    private Integer bindingOwnersStateId;

    //申请时间
    private Timestamp applicationTime;

    //手机类型
    private String phoneType;

    //房屋状态
    private BinDingOwnersState binDingOwnersState;

}
