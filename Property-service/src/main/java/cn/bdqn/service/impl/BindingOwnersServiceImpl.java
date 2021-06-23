package cn.bdqn.service.impl;

import cn.bdqn.domain.BindingOwners;
import cn.bdqn.mapper.BindingOwnersMapper;
import cn.bdqn.service.BindingOwnersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangcong
 * 业主绑定
 */
@Service
public class BindingOwnersServiceImpl implements BindingOwnersService {

    @Autowired
    private BindingOwnersMapper bindingOwnersMapper;



    @Override
    public PageInfo<BindingOwners> queryBinDingOwners(BindingOwners bindingOwners, Integer currentPage, Integer pageSize) {

        PageHelper.startPage(currentPage,pageSize);
        List<BindingOwners> lists = bindingOwnersMapper.SelectBinDingOwners(bindingOwners);

        PageInfo<BindingOwners> pageInfo = new PageInfo<BindingOwners>(lists);

        return pageInfo;
    }
}
