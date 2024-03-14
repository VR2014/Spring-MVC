package com.learnings.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChefController {

	@ResponseBody
	@RequestMapping("/chef")
	public String isChef() {
		return "Chef is at work";
	}

}
