package site.lgzzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import site.lgzzk.base.ResultInfo;
import site.lgzzk.entity.Manager;
import site.lgzzk.service.ManagerService;

import javax.annotation.Resource;

@Controller
@RequestMapping("managers")
public class ManagerController {

    @Resource
    ManagerService managerService;

    @PostMapping("login")
    @ResponseBody
    private ResultInfo managerLogin(@RequestBody Manager manager){
        ResultInfo resultInfo = new ResultInfo();
        Manager manager1 = managerService.managerLogin(manager.getName(), manager.getPassword());
        resultInfo.setResult(manager1);
        return resultInfo;
    }

}
