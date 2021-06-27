package cn.bdqn.service.impl;

import cn.bdqn.domain.InformationOfCaringPersonnel;
import cn.bdqn.mapper.InformationOfCaringPersonnelMapper;
import cn.bdqn.service.InformationOfCaringPersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationOfCaringPersonnelServiceImpl implements InformationOfCaringPersonnelService {

    @Autowired
    private InformationOfCaringPersonnelMapper informationOfCaringPersonnelMapper;

    @Override
    public List<InformationOfCaringPersonnel> selectAll() {
        return informationOfCaringPersonnelMapper.selectAll();
    }

    @Override
    public Integer inner(InformationOfCaringPersonnel informationOfCaringPersonnel) {
        return informationOfCaringPersonnelMapper.insertPersonnl(informationOfCaringPersonnel);
    }

    @Override
    public void delete(Integer id) {
        informationOfCaringPersonnelMapper.deletePersonnl(id);
    }

    public Integer updata(InformationOfCaringPersonnel informationOfCaringPersonnel){
        return informationOfCaringPersonnelMapper.updataPersonnl(informationOfCaringPersonnel);
    }

    public InformationOfCaringPersonnel selectid(Integer id){
        return informationOfCaringPersonnelMapper.selectid(id);
    }

    public List<InformationOfCaringPersonnel> select(InformationOfCaringPersonnel informationOfCaringPersonnel){
        return informationOfCaringPersonnelMapper.select(informationOfCaringPersonnel);
    }
}
