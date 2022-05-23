package io.goodname01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

	@GetMapping("/")
	public String index() {
        return "index"; //view
	}

}
