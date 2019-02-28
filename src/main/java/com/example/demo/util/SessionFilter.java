package com.example.demo.util;


import com.example.demo.model.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SessionFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hsRequest = (HttpServletRequest)request;
        HttpServletResponse hsResponse = (HttpServletResponse) response;
        User user = (User) hsRequest.getSession().getAttribute(Constant.login);

        String path = hsRequest.getRequestURI();
        if(path.contains("login")){
            chain.doFilter(request,response);
            return;
        }

        if(user != null){
            chain.doFilter(request,response);
        }else{
            chain.doFilter(request,response);
//            hsResponse.sendRedirect(((HttpServletRequest) request).getContextPath() + "/login");
        }
    }


    @Override
    public void destroy() {

    }
}
