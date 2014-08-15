package com.baldurtech;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class DispatchServlet extends HttpServlet{

    String defultPackageName = "com.baldurtech.Practice-the-ServletTest";
    
    public void service(HttpServletRequest request, HttpServletResponse response) 
    throws IOException, ServletException {
        
    }
    
    public String getActionClassNameByUri(String uri) {
        String[] uriParts = uri.split("/");
        Integer indexOfActionClassName = 1;
        String actionClassName = uriParts[indexOfActionClassName];
        actionClassName = capitalize(actionClassName);
        return defultPackageName + "." + actionClassName + "Action";
    }
    
    public String capitalize(String className) {
        className = className.substring(0, 1).toUpperCase() + className.substring(1);
        return className;
    }
    
    public String getMethodNameByUri(String uri) {
        String[] uriParts = uri.split("/");
        Integer indexOfMethodName = 2;
        if(uriParts.length <= indexOfMethodName) {
            return "index";
        }
        return uriParts[indexOfMethodName];
    }
}

















