package site.lgzzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.lgzzk.base.ResultInfo;
import site.lgzzk.entity.Manager;
import site.lgzzk.exceptions.ParamsException;
import site.lgzzk.model.ManagerModel;
import site.lgzzk.service.ManagerService;

import javax.annotation.Resource;

@Controller
@RequestMapping("managers")
public class ManagerController {

    @Resource
    ManagerService managerService;

    @PostMapping("login")
    @ResponseBody
    private ResultInfo managerLogin(@RequestBody(required = false) Manager manager) {
        ResultInfo resultInfo = new ResultInfo();
        if (manager == null) throw new ParamsException("缺少参数体！");
        ManagerModel managerModel = managerService.managerLogin(manager.getName(), manager.getPassword());
        resultInfo.setResult(managerModel);
        return resultInfo;
    }

}
