package com.baldurtech;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class DispatchServlet extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) 
    throws IOException, ServletException {
        
    }
    
    public String getActionClassNameByUri(String uri) {
        return "1";
    }
    
}