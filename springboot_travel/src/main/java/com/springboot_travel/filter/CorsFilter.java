package com.springboot_travel.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname CorsFilter
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/6 11:57
 * @Created by 石傲
 */
@WebFilter("/*")
public class CorsFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        //        允许的访问源
        response.setHeader("Access-Control-Allow-Origin", "*");
//         允许的请求方式：get、post
        response.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,HEAD");
//       用来指定本次预检请求的有效期，单位为秒
        response.setHeader("Access-Control-Max-Age", "3600");
//        请求头中必须包含的键值对
        response.addHeader("Access-Control-Allow-Headers", "Authentication,Origin, X-Requested-With, Content-Type, Accept,token");
//        允许暴露的响应头
        response.setHeader("Access-Control-Expose-Headers", "token");
//      允许访问的凭证是否作为响应的一部分
        response.setHeader("Access-Control-Allow-Credentials", "true");
        //预检请求：OPTIONS
        if (request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_OK);
            return;
        }
        //将请求交给目标资源
        chain.doFilter(request, response);
    }
}
