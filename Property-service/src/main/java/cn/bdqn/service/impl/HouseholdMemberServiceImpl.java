package cn.bdqn.service.impl;

import cn.bdqn.domain.HouseholdMember;
import cn.bdqn.mapper.HouseholdMemberMapper;
import cn.bdqn.service.HouseholdMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "HouseholdMemberService")
public class HouseholdMemberServiceImpl implements HouseholdMemberService {

    @Autowired
    private HouseholdMemberMapper householdMemberMapper;

    @Override
    public List<HouseholdMember> householdMemberQueryByHouseholdId(Integer householdId) {
        return householdMemberMapper.householdMemberSelectByHouseholdId(householdId);
    }

    @Override
    public void householdMemberDeleteByTheOwnerId(Integer theOwnerId) {
        householdMemberMapper.householdMemberDeleteByTheOwnerId(theOwnerId);
    }

    @Override
    public void householdMemberUpdate(HouseholdMember householdMember) {
        householdMemberMapper.householdMemberUpdate(householdMember);
    }

    @Override
    public void householdMemberSave(HouseholdMember householdMember) {
        householdMemberMapper.householdMemberInsert(householdMember);
    }
}
