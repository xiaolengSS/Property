package cn.bdqn.service.impl;

import cn.bdqn.domain.Admin;
import cn.bdqn.mapper.AdminMapper;
import cn.bdqn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceimpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    //查看管理员是否存在
    @Override
    public Integer queryByadmin(Admin admin) {
        return adminMapper.selectByAdmin(admin);
    }
}
