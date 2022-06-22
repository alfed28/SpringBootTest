package com.shiao.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname TestFilter
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/17 19:26
 * @Created by 石傲
 */
@WebFilter("/*")
public class TestFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("filter is run_____________");
        chain.doFilter(request,response);
    }
}
