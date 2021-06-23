package cn.bdqn.service;

import cn.bdqn.domain.BindingOwners;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author zhangcong
 * @date 2021/5/24 -13:44
 */
public interface BindingOwnersService {

    //多条件查询绑定的业主信息
    public PageInfo<BindingOwners> queryBinDingOwners(BindingOwners bindingOwners, Integer currentPage, Integer pageSize);

}
