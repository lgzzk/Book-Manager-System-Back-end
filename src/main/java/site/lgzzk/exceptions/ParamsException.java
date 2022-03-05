package site.lgzzk.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ParamsException extends Exception {

    public ParamsException() {
    }

    public ParamsException(String message) {
        super(message);
    }

    public String getMsg() {
        return super.getMessage();
    }

}
