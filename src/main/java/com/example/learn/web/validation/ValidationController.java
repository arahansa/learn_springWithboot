package com.example.learn.web.validation;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Data;

@Controller
public class ValidationController {
	
	@RequestMapping(value = "/test/validation", method= RequestMethod.GET)
	public String validationTest(@ModelAttribute ValidationTest validationTest){
		return "/validation/form";
	}
	
	@RequestMapping(value="/test/validation", method = RequestMethod.POST)
	public String validation(@Valid @ModelAttribute ValidationTest validationTest, BindingResult result){
		if(result.hasErrors()){
			return "/validation/form";	
		}
		return "/validation/index";
	}
	
	@Data
	static class ValidationTest{
		@Max(10)
		int age;
		@Size(max=10)
		String msg;
		@NotBlank
		String test;
	}
	
	

}
