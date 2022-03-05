package site.lgzzk.service;

import org.springframework.stereotype.Service;
import site.lgzzk.dao.ManagerDao;
import site.lgzzk.entity.Manager;

import javax.annotation.Resource;

@Service
public class ManagerService {

    @Resource
    private ManagerDao managerDao;

    public Manager managerLogin(String name, String password){
        Manager manager = managerDao.queryManagerByName(name);
        if (manager!=null && manager.getPassword().equals(password))
            return manager;
        return null;
    }
}
