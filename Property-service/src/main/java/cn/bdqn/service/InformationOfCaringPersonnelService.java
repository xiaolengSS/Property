package cn.bdqn.service;

import cn.bdqn.domain.InformationOfCaringPersonnel;

import java.util.List;

public interface InformationOfCaringPersonnelService {
    //查询所有人员信息
    public List<InformationOfCaringPersonnel> selectAll();

    //添加人员信息
    public Integer inner(InformationOfCaringPersonnel informationOfCaringPersonnel);

    //删除人员
    public void delete(Integer id);

    //修改人员
    public Integer updata(InformationOfCaringPersonnel informationOfCaringPersonnel);

    //根据id查询
    public InformationOfCaringPersonnel selectid(Integer id);

    //条件查询
    public List<InformationOfCaringPersonnel> select(InformationOfCaringPersonnel informationOfCaringPersonnel);
}
