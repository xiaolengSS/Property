package cn.bdqn.mapper;

import cn.bdqn.domain.BindingOwners;

import java.util.List;

/**
 * @author zhangcong
 * @date 2021/5/24 -12:56
 */
public interface BindingOwnersMapper {

    //根据业主条件查询信息
    public List<BindingOwners> SelectBinDingOwners(BindingOwners bindingOwners);
}
