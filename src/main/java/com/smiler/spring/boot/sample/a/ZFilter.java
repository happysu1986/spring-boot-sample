package com.smiler.spring.boot.sample.a;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "ZFilter", urlPatterns = "/*")
public class ZFilter implements Filter {

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("ZFilter执行过滤操作");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }

}