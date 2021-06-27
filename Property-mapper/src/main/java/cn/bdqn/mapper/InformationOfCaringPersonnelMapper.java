package cn.bdqn.mapper;

import cn.bdqn.domain.InformationOfCaringPersonnel;

import java.util.List;

//重点关怀人员信息Mapper
public interface InformationOfCaringPersonnelMapper {
    //查询所有人员信息
    public List<InformationOfCaringPersonnel> selectAll();

    //添加关怀人员
    public Integer insertPersonnl(InformationOfCaringPersonnel informationOfCaringPersonnel);

    //删除关怀人员
    public void deletePersonnl(Integer id);

    //修改关怀人员
    public Integer updataPersonnl(InformationOfCaringPersonnel informationOfCaringPersonnel);

    //根据id查询信息
    public InformationOfCaringPersonnel selectid(Integer id);

    //根据条件查询
    public List<InformationOfCaringPersonnel> select(InformationOfCaringPersonnel informationOfCaringPersonnel);
}
