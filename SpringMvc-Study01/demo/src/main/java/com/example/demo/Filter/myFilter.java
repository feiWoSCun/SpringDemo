package com.example.demo.Filter;

import javax.servlet.*;
import java.io.IOException;

public class myFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
   /*     servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");*/
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
