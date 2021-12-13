package com.pure.common.exception;

import com.pure.common.api.IResultCode;
import com.pure.common.api.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-09 13:40:00
 */
@Slf4j
@Component
@RestControllerAdvice
public class PureExceptionHandler {

    @ExceptionHandler(value = PureException.class)
    public Result<Object> businessException(PureException e){
        log.error(e.getMessage(), e);
        return Result.fail(e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public Result<IResultCode> commonException(Exception e){
        log.error(e.getMessage(), e);
        return Result.fail(CommonErrorEnum.OTHER_ERROR);
    }
}
