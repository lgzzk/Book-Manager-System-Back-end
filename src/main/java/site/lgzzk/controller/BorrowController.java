package site.lgzzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.lgzzk.base.ResultInfo;
import site.lgzzk.dto.BorrowOrderDto;
import site.lgzzk.service.BorrowService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BorrowController {

    @Resource
    BorrowService borrowService;

    @GetMapping("borrowOrder")
    @ResponseBody
    private ResultInfo borrowOrder(){
        ResultInfo resultInfo = new ResultInfo();
        List<BorrowOrderDto> borrowOrderDtoList = borrowService.borrowOrder();
        resultInfo.setResult(borrowOrderDtoList);
        return resultInfo;
    }


}
