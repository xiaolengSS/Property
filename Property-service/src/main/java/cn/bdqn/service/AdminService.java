package cn.bdqn.service;

import cn.bdqn.domain.Admin;


public interface AdminService {
    //查询管理员是否存在
    public  Integer queryByadmin(Admin admin);
}
