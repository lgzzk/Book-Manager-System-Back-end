package site.lgzzk;

import org.junit.Test;
import site.lgzzk.dao.ManagerDao;
import site.lgzzk.entity.Manager;

import javax.annotation.Resource;

public class AppTest extends BaseTest {

    @Resource
    ManagerDao managerDao;

    @Test
    public void queryManagerByNameTest(){
        Manager mr = managerDao.queryManagerByName("mr");
        System.out.println(mr);
    }

}
