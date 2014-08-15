package com.baldurtech;

import com.baldurtech.util.TestCase;

public class DispatchServletTest extends TestCase {

    DispatchServlet dispatchServlet = new DispatchServlet();
    String contactActionClassName = "com.baldurtech.Practice-the-ServletTest.ContactAction";
    
    public void test_uri_contact_show_应该由ContactAction来处理() {
        assertEquals(contactActionClassName, dispatchServlet.getActionClassNameByUri("/contact/show.jsp"));
    }
    
    public void test_uri_contact_应该有ContactAction来处理() {
        assertEquals(contactActionClassName, dispatchServlet.getActionClassNameByUri("/contact.jsp"));
    }
    
    public void test_uri_contact_show_应该由show方法来处理() {
        assertEquals("show", dispatchServlet.getMethodNameByUri("/contact/show.jsp"));
    }
    
    public void test_uri_contact_的默认处理方法是index() {
        assertEquals("index", dispatchServlet.getMethodNameByUri("/contact.jsp"));
    }
    
    public void test_uri_contact_show_的显示页面应该是_jsp_contact_show() {
        assertEquals("/WEB-INF/jsp/contact/show.jsp", dispatchServlet.getViewPage("/contact/show.jsp"));
    }
}
