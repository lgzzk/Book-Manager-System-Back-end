package site.lgzzk.dao;

import site.lgzzk.dto.BorrowOrderDto;

import java.util.List;

public interface BorrowDao {

    List<BorrowOrderDto> queryBorrowOrder();

}
