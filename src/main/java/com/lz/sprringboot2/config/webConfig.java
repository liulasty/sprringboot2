package com.lz.sprringboot2.config;

/*
 * Created with IntelliJ IDEA.
 * @Author: lz
 * @Date: 2024/06/30/下午3:15
 * @Description:
 */

import com.lz.sprringboot2.web.handle.MyHandlerMethodReturnValueHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author lz
 */
@Configuration
@Slf4j
public class webConfig implements WebMvcConfigurer {
    // @Override
    // public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
    //     // handlers.add(new MyHandlerMethodReturnValueHandler());
    //    
    // }
}