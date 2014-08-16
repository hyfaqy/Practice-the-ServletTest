package com.baldurtech;

import com.baldurtech.util.TestCase;

public class ActionTest extends TestCase {
    Action action = new ContactAction();
    public void test_uri_contact_ShouldBe_show_jsp_contact_show() {
        
        assertEquals("/WEB-INF/jsp/contact/show.jsp", action.getViewPage("/contact/show.jsp"));
    }
}
