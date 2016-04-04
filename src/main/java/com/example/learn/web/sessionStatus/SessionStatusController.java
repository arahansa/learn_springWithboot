package com.example.learn.web.sessionStatus;

import java.util.Arrays;
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

	
	
	
	@RequestMapping(value="/test/sessionStatus", method=RequestMethod.GET)
	public String sessionStatus(@ModelAttribute Article article){
		return "sessionStatus/form";
	}
	
	@RequestMapping(value="/test/sessionStatus", method=RequestMethod.POST)
	public String sessionStatusPost(Article article){
		testMap.put(article.getId(), article);
		return "redirect:sessionStatus/list";
	}
	
	@RequestMapping(value="/test/sessionStatus/list" , method=RequestMethod.GET)
	public String list(Model model){
		List<Article> collect = testMap.entrySet().stream()
				.map(Map.Entry::getValue).collect(Collectors.toList());
		log.info("collection : {} ", collect);
		model.addAttribute("list", collect);
		return "sessionStatus/list";
	}
	
	@RequestMapping(value="/test/sessionStatus/update/{id}", method=RequestMethod.GET)
	public String updateForm(@PathVariable Integer id, Model model){
		Article article = testMap.get(id);
		model.addAttribute("updateArticle", article);
		return "sessionStatus/updateForm";
	}
	
	
	
	@RequestMapping(value="/test/sessionStatus/update", method=RequestMethod.POST)
	public String updatePost(@ModelAttribute("updateArticle") Article article, SessionStatus sessionStatus){
		log.info("article : {}" , article);
		testMap.put(article.getId(), article);
		sessionStatus.setComplete();
		return "redirect:list";
	}
	
	@RequestMapping(value="/test/sessionStatus/updateFail/{id}", method=RequestMethod.GET)
	public String updateForm2(@PathVariable Integer id, Model model){
		Article article = testMap.get(id);
		model.addAttribute("updateA", article);
		return "sessionStatus/updateFormFail";
	} 
	
	@RequestMapping(value="/test/sessionStatus/updateFail", method=RequestMethod.POST)
	public String updatePostFail(Article article){
		log.info("article : {}" , article);
		testMap.put(article.getId(), article);
		return "redirect:list";
	}
	
	@RequestMapping("/test/sessionStatus/test")
	public String testtest(Model model){
		Article article = new Article();
		article.setAge(1);
		article.setId(1);
		article.setMsg("hi");
		article.setHiddenMsg("hello");
		Article article2 = new Article();
		article2.setAge(1);
		article2.setId(1);
		article2.setMsg("hi");
		article2.setHiddenMsg("hello");
		model.addAttribute("list", Arrays.asList(article, article2));
		return "sessionStatus/list";
	}
	
	
	
	
	
	

}
