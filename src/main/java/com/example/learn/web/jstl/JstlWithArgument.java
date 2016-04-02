package com.example.learn.web.jstl;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;
import lombok.Value;

@Controller
public class JstlWithArgument {

	@RequestMapping("/test/jslArg")
	public String arg(Model model){
		Map<String, String>map = new java.util.HashMap<>();
		map.put("1", "메시지1");
		map.put("2", "메시지2");
		model.addAttribute("arg", ArgTest.of(20)).addAttribute("result", map);
		model.addAttribute("enumList", TestEnum.values());
		return "jstl/args";
	}
	
	@Data
	@Value(staticConstructor="of")
	static class ArgTest{
		int age;
		public String getMessage(String message){
			return "test"+message;
		}
		public String test(String message){
			return "test"+message;
		}
	}
}
