package com.example.hi.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class IndexController {
	
	@RequestMapping(value="/")
	public String Index()throws Exception{
		return "Hello!!!!";
	}

}
