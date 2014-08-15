package com.baldurtech;

import com.baldurtech.util.TestCase;

public class DispatchServletTest extends TestCase {

    DispatchServlet dispatchServlet = new DispatchServlet();
    String contactActionClassName = "com.baldurtech.Practice-the-ServletTest.ContactAction";
    
    public void test_uri_contact_show_Ӧ����ContactAction������() {
        assertEquals(contactActionClassName, dispatchServlet.getActionClassNameByUri("/contact/show"));
    }
    
    public void test_uri_contact_Ӧ����ContactAction������() {
        assertEquals(contactActionClassName, dispatchServlet.getActionClassNameByUri("/contact"));
    }
    
    public void test_uri_contact_show_Ӧ����show����������() {
        assertEquals("show", dispatchServlet.getMethodNameByUri("/contact/show"));
    }
    
    public void test_uri_contact_��Ĭ�ϴ�������index() {
        assertEquals("index", dispatchServlet.getMethodNameByUri("/contact"));
    }
}
