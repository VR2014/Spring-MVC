package com.learnings.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagerController {
	
	@ResponseBody
	@RequestMapping("/manager")
	public String isManager() {
		return "manager is in Cash counter";
	}

}
