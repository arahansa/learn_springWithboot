package com.example.learn.web.locale;

import java.util.Locale;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LocaleTestController {
	
	@RequestMapping("/test/locale")
	@ResponseBody
	public String index(Locale locale){
		log.debug("locale : ", locale);
		return "3" + locale.toString();
	}
	

}
