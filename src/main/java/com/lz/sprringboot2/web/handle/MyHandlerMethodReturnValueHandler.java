package com.lz.sprringboot2.web.handle;

/*
 * Created with IntelliJ IDEA.
 * @Author: lz
 * @Date: 2024/06/30/下午3:17
 * @Description:
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @author lz
 */
@Slf4j
public class MyHandlerMethodReturnValueHandler implements HandlerMethodReturnValueHandler {
    
    private HandlerMethodReturnValueHandler delegate;
    
    public MyHandlerMethodReturnValueHandler(HandlerMethodReturnValueHandler delegate) {
        this.delegate = delegate;
    }
    
    /**
     * 判断是否支持返回值类型
     * @param returnType
     * @return
     */
    @Override
    public boolean supportsReturnType(MethodParameter returnType) {
        return true;
    }

    @Override
    public void handleReturnValue(Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer, NativeWebRequest webRequest) throws Exception {
        log.info("MyHandlerMethodReturnValueHandler", returnValue);
        delegate.handleReturnValue(returnValue, returnType, mavContainer, webRequest);
    }
}