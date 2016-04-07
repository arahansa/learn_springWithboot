package com.example.learn.web.conversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ConverionServiceTestController {

//	@Autowired
//	ConversionService conversionService;
//
//	@InitBinder
//	public void initBinder(WebDataBinder dataBinder) {
//		dataBinder.setConversionService(this.conversionService);
//	}
	
	
	@RequestMapping(value = "/test/convert")
	@ResponseBody
	public String test(Level level , Model model) {
		log.info("Level  : {} ", level);
		return level.toString();
	}

}
