package cn.bdqn.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhangcong
 * @date 2021/5/24 -13:23
 */

@Data
@AllArgsConstructor
public class BinDingOwnersState {
    //状态id
    private Integer id;
    //状态
    private String state;

}
