package com.learnings.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {

	@ResponseBody
	@RequestMapping("/menu")
	public String lisOfitems() {
		return "Idly ,Dosa ";
	}
}
