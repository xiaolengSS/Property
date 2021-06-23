package cn.bdqn.mapper;

import cn.bdqn.domain.Dispatch;

import java.util.List;

public interface DispatchMapper {

    //查询全部派单方式
    public List<Dispatch> dispatchQueryAll();

}
