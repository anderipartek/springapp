package com.companyname.springapp.web;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTests {

	

	@Test
	public void test() throws Exception {
		fail("kagada");
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
	}

}
