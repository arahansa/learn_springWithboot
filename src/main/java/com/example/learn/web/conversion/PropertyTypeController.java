package com.example.learn.web.conversion;

import java.beans.PropertyEditorSupport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PropertyTypeController {

	public static class MyConverter extends PropertyEditorSupport {
		@Override
		public void setAsText(String text) throws IllegalArgumentException {
			setValue(Level.valueOf(Integer.parseInt(text)));
		}
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Level.class, new MyConverter());
	}

	@RequestMapping("/test/propertyEditorTest")
	@ResponseBody
	public String levelTest(Level level) {
		return level.toString();
	}
}
