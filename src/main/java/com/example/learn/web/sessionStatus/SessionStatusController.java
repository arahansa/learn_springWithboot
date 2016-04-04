package com.example.learn.web.sessionStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SessionAttributes("updateArticle")
@Controller
public class SessionStatusController {
	
	private Map<Integer, Article> testMap = new HashMap<>();

	@Data
	static class Article{
		int id, age; 
		String msg, hiddenMsg;
	}	
	
	
	@RequestMapping(value="/test/sessionStatus", method=RequestMethod.GET)
	public String sessionStatus(@ModelAttribute Article article){
		return "sessionStatus/form";
	}
	
	@RequestMapping(value="/test/sessionStatus", method=RequestMethod.POST)
	public String sessionStatusPost(Article article){
		testMap.put(article.getId(), article);
		return "redirect:list";
	}
	
	@RequestMapping(value="/test/sessionStatus/list" , method=RequestMethod.GET)
	public String list(Model model){
		List<Article> collect = testMap.entrySet().stream()
				.map(Map.Entry::getValue).collect(Collectors.toList());
		model.addAttribute("list", collect);
		return "sessionStatus/list";
	}
	
	@RequestMapping(value="/test/sessionStatus/update/{id}", method=RequestMethod.GET)
	public String updateForm(@PathVariable Integer id, Model model){
		Article article = testMap.get(id);
		model.addAttribute("updateArticle", article);
		return "sessionStatus/updateForm";
	}
	
	@RequestMapping(value="/test/sessionStatus/updateFail/{id}", method=RequestMethod.GET)
	public String updateForm2(@PathVariable Integer id, Model model){
		Article article = testMap.get(id);
		model.addAttribute("updateA", article);
		return "sessionStatus/updateFormFail";
	} 
	
	
	@RequestMapping(value="/test/sessionStatus/update", method=RequestMethod.POST)
	public String updatePost(Article article, SessionStatus sessionStatus){
		log.info("article : {}" , article);
		testMap.put(article.getId(), article);
		sessionStatus.setComplete();
		return "sessionStatus/list";
	}
	
	@RequestMapping(value="/test/sessionStatus/update", method=RequestMethod.POST)
	public String updatePostFail(Article article, SessionStatus sessionStatus){
		log.info("article Fail : {}" , article);
		testMap.put(article.getId(), article);
		sessionStatus.setComplete();
		return "sessionStatus/list";
	}
	
	
	
	

}
