package site.lgzzk;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import site.lgzzk.base.ResultInfo;
import site.lgzzk.exceptions.ParamsException;

/**
 * 全局异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandlerResolver {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultInfo exceptionHandler(Exception e) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(500);
        resultInfo.setMsg("内部服务器错误 - " + e.getMessage());
        return resultInfo;
    }


    @ExceptionHandler(ParamsException.class)
    @ResponseBody
    public ResultInfo paramsExceptionHandler(ParamsException p) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(p.getCode());
        resultInfo.setMsg(p.getMsg());
        return resultInfo;
    }

}
