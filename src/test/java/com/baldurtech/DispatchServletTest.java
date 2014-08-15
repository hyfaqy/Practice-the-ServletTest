package com.baldurtech;

import com.baldurtech.util.TestCase;

public class DispatchServletTest extends TestCase {

    public void test_uri_contact_show_应该由ContactAction来处理() {
        DispatchServlet dispatchServlet = new DispatchServlet();
        assertEquals("com.baldurtech.practice_servlet_test/contact/show", dispatchServlet.getActionClassNameByUri("/contact/show"));
    }
}
