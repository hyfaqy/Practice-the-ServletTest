package com.baldurtech;

import com.baldurtech.util.TestCase;

public class DispatchServletTest extends TestCase {

    DispatchServlet dispatchServlet = new DispatchServlet();
    String contactActionClassName = "com.baldurtech.Practice-the-ServletTest.ContactAction";
    
    public void test_uri_contact_show_Ӧ����ContactAction������() {
        assertEquals(contactActionClassName, dispatchServlet.getActionClassNameByUri("/contact/show.jsp"));
    }
    
    public void test_uri_contact_Ӧ����ContactAction������() {
        assertEquals(contactActionClassName, dispatchServlet.getActionClassNameByUri("/contact.jsp"));
    }
    
    public void test_uri_contact_show_Ӧ����show����������() {
        assertEquals("show", dispatchServlet.getMethodNameByUri("/contact/show.jsp"));
    }
    
    public void test_uri_contact_��Ĭ�ϴ�������index() {
        assertEquals("index", dispatchServlet.getMethodNameByUri("/contact.jsp"));
    }
    
    public void test_uri_contact_show_����ʾҳ��Ӧ����_jsp_contact_show() {
        assertEquals("/WEB-INF/jsp/contact/show.jsp", dispatchServlet.getViewPage("/contact/show.jsp"));
    }
}
