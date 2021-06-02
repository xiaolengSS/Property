package cn.bdqn.service;

import cn.bdqn.domain.HouseholdMember;
import cn.bdqn.mapper.HouseholdMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HouseholdMemberService {

    //根据业主id查询成员信息
    public List<HouseholdMember> householdMemberQueryByHouseholdId(Integer householdId);

    //根据成员id删除成员信息
    public void householdMemberDeleteByTheOwnerId(Integer theOwnerId);

    //修改成员信息
    public void householdMemberUpdate(HouseholdMember householdMember);

    //添加成员信息
    public void householdMemberSave(HouseholdMember householdMember);

}
