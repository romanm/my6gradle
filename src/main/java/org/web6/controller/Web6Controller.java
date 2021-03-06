package org.web6.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Web6Controller {
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World") 
							String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("------------------------------ home ------------------------");
		return "home";
	}
	@RequestMapping("/angularjs-The-Basics")
	public String angularjsTheBasics() {
		return "angularjs-The-Basics";
	}

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/json")
	public @ResponseBody Greeting json(
			@RequestParam(value="name", required=false, defaultValue="World") 
			String name) {
		System.out.println("------------------------------ 1 ------------------------");
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}

}
