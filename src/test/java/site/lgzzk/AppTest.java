package site.lgzzk;

import org.junit.Test;
import site.lgzzk.dao.ManagerDao;
import site.lgzzk.entity.Manager;
import site.lgzzk.utils.JwtUtil;

import javax.annotation.Resource;
import java.util.UUID;

public class AppTest extends BaseTest {

    @Resource
    ManagerDao managerDao;

    @Test
    public void queryManagerByNameTest() {
        Manager mr = managerDao.queryManagerByName("mr");
        System.out.println(mr);
    }

    @Test
    public void test() {
        for (int i = 0; i < 100; i++) {
            System.out.println(UUID.randomUUID());
        }
    }

    @Test
    public void jwt() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6ImFkbWluIiwicm9sZSI6ImFkbWluIiwic3ViIjoiand0LWxnenprIiwiZXhwIjoxNjQ2Nzk3NDg3LCJqdGkiOiIyZTRiY2UwMC0yMWQ2LTRhZjMtOWMyMS1jYTNlYjUxZjM2NTQifQ.AHgYYRXLJwazg9CMDaAwxG-bbRAiEgwltlCOF8la_-M";
        System.out.println(JwtUtil.checkToken(token));
    }

}
