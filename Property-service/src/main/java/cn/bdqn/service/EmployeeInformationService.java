package cn.bdqn.service;

import cn.bdqn.domain.EmployeeInformation;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeInformationService {

    //带分页的模糊查询&查询全部
    public PageInfo<EmployeeInformation> employeeInformationQueryVague(Integer currentPage, Integer pageSize,EmployeeInformation employeeInformation);

    //根据id修改员工信息
    public void employeeInformationUpdateById(EmployeeInformation employeeInformation);

    //根据员工id删除员工信息
    public void employeeInformationDeleteById(Integer id);

    //添加员工信息
    public void employeeInformationSave(EmployeeInformation employeeInformation);



}
