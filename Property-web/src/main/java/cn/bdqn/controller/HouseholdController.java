package cn.bdqn.controller;

import cn.bdqn.service.HouseholdService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jinsuisheng
 * @date 2021年05月24日 14:56
 */
@RestController
@RequestMapping("/househoid")
public class HouseholdController {

    @Resource
    private HouseholdService householdService;

    //业主房屋解绑 id:业主id
    @RequestMapping("/changeByHouseholdUnbundle")
    public Integer changeByHouseholdUnbundle(Integer id){
        return householdService.changeByHouseholdUnbundle(id);
    }

    //业主房屋绑定 id:业主id houseId：房屋ID communityId：小区ID
    @RequestMapping("/changeByHouseholdBinding")
    public Integer changeByHouseholdBinding(Integer id,Integer houseId,Integer communityId){
        return householdService.changeByHouseholdBinding(id,houseId,communityId);
    }
}
