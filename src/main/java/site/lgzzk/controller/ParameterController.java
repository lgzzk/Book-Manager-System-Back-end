package site.lgzzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import site.lgzzk.base.ResultInfo;
import site.lgzzk.entity.Parameter;
import site.lgzzk.service.ParameterService;

import javax.annotation.Resource;

/**
 * (Parameter)表控制层
 *
 * @author lgzzk
 * @since 2022-03-19 21:41:37
 */
@Controller
@RequestMapping("parameter")
public class ParameterController {
    /**
     * 服务对象
     */
    @Resource
    private ParameterService parameterService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @ResponseBody
    public ResultInfo queryById(@PathVariable("id") Integer id) {
        ResultInfo resultInfo = new ResultInfo();
        Parameter parameter = parameterService.queryById(id);
        resultInfo.setResult(parameter);
        return resultInfo;
    }


    /**
     * 编辑数据
     *
     * @param parameter 实体
     * @return 编辑结果
     */
    @PutMapping("")
    @ResponseBody
    public ResultInfo edit(@RequestBody Parameter parameter) {
        System.out.println(parameter);
        ResultInfo resultInfo = new ResultInfo();
        int update = parameterService.update(parameter);
        resultInfo.setResult(update);
        return resultInfo;
    }

}

