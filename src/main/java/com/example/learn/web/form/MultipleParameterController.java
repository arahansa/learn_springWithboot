package com.example.learn.web.form;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MultipleParameterController {
	
	@RequestMapping("/test/multiple")
	public String multipleParam(@ModelAttribute TestMultipleParam result , Model model ){
		log.info("multipleParam : {} ", result);
		model.addAttribute("result", result);
		return "multipleParam/result";
	}
	
	@RequestMapping("/test/multiple/form")
	public String Form(){
		return "multipleParam/form";
	}

}
