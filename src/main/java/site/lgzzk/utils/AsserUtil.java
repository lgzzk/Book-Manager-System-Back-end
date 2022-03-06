package site.lgzzk.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import site.lgzzk.exceptions.ParamsException;

@ControllerAdvice
public class AsserUtil {
    public static void isTure(Boolean flag, String msg){
        if (flag) throw new ParamsException(msg);
    }
}
