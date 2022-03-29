package site.lgzzk.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import site.lgzzk.dao.BorrowDao;
import site.lgzzk.dto.BorrowOrderDto;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BorrowService {

    @Resource
    BorrowDao borrowDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public List<BorrowOrderDto> borrowOrder(){
        return borrowDao.queryBorrowOrder();
    }

}
