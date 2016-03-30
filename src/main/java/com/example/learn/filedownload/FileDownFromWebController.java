package com.example.learn.filedownload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileDownFromWebController {

	@RequestMapping("/test/download")
	@ResponseBody
	public String test(){
		
		
		return "test";
	}
}
