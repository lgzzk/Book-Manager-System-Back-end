package site.lgzzk.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import site.lgzzk.dao.ManagerDao;
import site.lgzzk.entity.Manager;
import site.lgzzk.model.ManagerModel;
import site.lgzzk.utils.AsserUtil;

import javax.annotation.Resource;

@Service
public class ManagerService {

    @Resource
    private ManagerDao managerDao;

    public ManagerModel managerLogin(String name, String pwd){

        AsserUtil.isTure(StringUtils.isBlank(name), "用户名不能为空！");
        AsserUtil.isTure(StringUtils.isBlank(pwd), "用户密码不能为空！");

        Manager manager = managerDao.queryManagerByName(name);

        AsserUtil.isTure(manager == null, "用户名不存在！");

        AsserUtil.isTure(!manager.getPassword().equals(pwd), "用户密码不正确！");

        ManagerModel managerModel = new ManagerModel();
        managerModel.setId(manager.getId());
        managerModel.setName(manager.getName());

        return managerModel;
    }
}
