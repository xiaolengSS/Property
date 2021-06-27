package cn.bdqn.service.impl;

import cn.bdqn.domain.EmployeeInformation;
import cn.bdqn.mapper.EmployeeInformationMapper;
import cn.bdqn.service.EmployeeInformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "employeeInformationService")
public class EmployeeInformationServiceImpl implements EmployeeInformationService {

    @Autowired
    private EmployeeInformationMapper employeeInformationMapper;

    @Override
    public PageInfo<EmployeeInformation> employeeInformationQueryVague(Integer currentPage, Integer pageSize, EmployeeInformation employeeInformation) {

        PageHelper.startPage(currentPage,pageSize);

        List<EmployeeInformation> employeeInformations = employeeInformationMapper.employeeInformationSelectVague(employeeInformation);

        PageInfo<EmployeeInformation> employeeInformationPageInfo =new PageInfo<>(employeeInformations);

        return employeeInformationPageInfo;
    }

    @Override
    public void employeeInformationUpdateById(EmployeeInformation employeeInformation) {
        employeeInformationMapper.employeeInformationUpdateById(employeeInformation);
    }

    @Override
    public void employeeInformationDeleteById(Integer id) {
        employeeInformationMapper.employeeInformationDeleteById(id);
    }

    @Override
    public void employeeInformationSave(EmployeeInformation employeeInformation) {
        employeeInformationMapper.employeeInformationInsert(employeeInformation);
    }
}
