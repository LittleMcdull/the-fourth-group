package com.suixingpay.control;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.suixingpay.interceptor.ExcuteTimeInterceptor;

/**
 * @Auther: Dana_ZHANG;email:1602334641@qq.com
 * @Date: 2018/11/2 14:46
 * @Description:
 */
@Configuration
public class Interceptor_Control extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 多个拦截器组成一个拦截器链
         * addPathPatterns 用于添加拦截规则
          */
        registry.addInterceptor(new ExcuteTimeInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }


}