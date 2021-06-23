package cn.bdqn.mapper;

import cn.bdqn.domain.EmployeeInformation;

import java.util.List;

public interface EmployeeInformationMapper {

    //带分页的模糊查询&查询全部
    public List<EmployeeInformation> employeeInformationSelectVague(EmployeeInformation employeeInformation);

    //根据id修改员工信息
    public void employeeInformationUpdateById(EmployeeInformation employeeInformation);

    //根据员工id删除员工信息
    public void employeeInformationDeleteById(Integer id);

    //添加员工信息
    public void employeeInformationInsert(EmployeeInformation employeeInformation);

}
