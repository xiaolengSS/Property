package cn.bdqn.mapper;

import cn.bdqn.domain.HouseholdMember;

import java.util.List;

public interface HouseholdMemberMapper {

    /*
    *   在业主心爱的操作中还需要进行：
    *       根据业主名称，和房屋编号进行的模糊查询，以及查询全部---带分页的操作
    *
    * */


    //根据业主id查询成员信息
    public List<HouseholdMember> householdMemberSelectByHouseholdId(Integer householdId);

    //根据成员id删除成员信息
    public void householdMemberDeleteByTheOwnerId(Integer theOwnerId);

    //根据成员id修改成员信息
    public void householdMemberUpdate(HouseholdMember householdMember);

    //添加成员信息
    public void householdMemberInsert(HouseholdMember householdMember);


}
