package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("host", "index");
		return "index";
		
	}
	@RequestMapping("/index2")
	public String index2(ModelMap model){
		model.addAttribute("host", "index2");
		return "index2";
		
	}
	@RequestMapping("/hello")
	public @ResponseBody String greeting(){
		return "Hello World!";
	}

}
