package site.lgzzk;

import org.junit.Test;
import site.lgzzk.dao.ManagerDao;
import site.lgzzk.entity.Manager;

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

    }

    @Test
    public void parseToken() {
//        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6ImxnenprIiwicm9sZSI6ImFkbWluIiwic3ViIjoiand0LXRlc3QiLCJleHAiOjE2NDY1ODQzNzgsImp0aSI6IjY0NGZmZTgxLTBiODYtNDkwNS05ZGM3LWJjYWY2ZjBkMjA1NSJ9.XhEBbfyjR7zyYnFtaGXh3sJEYebW1NUkTKCNQzezgX0";
//        JwtParser parser = Jwts.parser();
//        Jws<Claims> claimsJws = parser.setSigningKey(signature).parseClaimsJws(token);
//        Claims body = claimsJws.getBody();
//        System.out.println(body);
//        System.out.println(body.getExpiration());
    }

}
