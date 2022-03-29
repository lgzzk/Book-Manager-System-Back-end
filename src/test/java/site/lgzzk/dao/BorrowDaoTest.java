package site.lgzzk.dao;

import org.junit.Test;
import site.lgzzk.BaseTest;
import site.lgzzk.dto.BorrowOrderDto;

import javax.annotation.Resource;
import java.util.List;

public class BorrowDaoTest extends BaseTest {

    @Resource
    BorrowDao borrowDao;

    @Test
    public void testQueryBorrowOrder() {
        List<BorrowOrderDto> borrowOrderDtoList = borrowDao.queryBorrowOrder();
        borrowOrderDtoList.forEach(borrowOrderDto -> {
            System.out.println(borrowOrderDto);
        });
    }
}