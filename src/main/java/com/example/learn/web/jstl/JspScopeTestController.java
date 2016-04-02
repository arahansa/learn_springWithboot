package com.example.learn.web.jstl;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class JspScopeTestController {

	@Autowired
	ServletContext servletContext;
	
	@RequestMapping("/test/jspScope")
	public String test(String message){
		log.info("message : {} ", message);
		servletContext.setAttribute("message", message);
		return "jstl/index";
	}
	
	@RequestMapping("/test/jspScope2")
	public String test2(){
		return "jstl/index";
	}
}
