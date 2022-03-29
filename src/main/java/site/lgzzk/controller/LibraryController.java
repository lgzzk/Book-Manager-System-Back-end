package site.lgzzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import site.lgzzk.base.ResultInfo;
import site.lgzzk.entity.Library;
import site.lgzzk.service.LibraryService;

import javax.annotation.Resource;

/**
 * (Library)表控制层
 *
 * @author lgzzk
 * @since 2022-03-18 15:54:39
 */
@Controller
@RequestMapping("library")
public class LibraryController {
    /**
     * 服务对象
     */
    @Resource
    private LibraryService libraryService;

    @GetMapping("{id}")
    @ResponseBody
    private ResultInfo queryById(@PathVariable Integer id) {
        ResultInfo resultInfo = new ResultInfo();
        Library library = libraryService.queryById(id);
        resultInfo.setResult(library);
        return resultInfo;
    }

    @PutMapping("")
    @ResponseBody
    private ResultInfo update(@RequestBody Library library) {
        ResultInfo resultInfo = new ResultInfo();
        System.out.println(library);
        int update = libraryService.update(library);
        resultInfo.setResult(update);
        return resultInfo;
    }

}

