package com.example.spring_boot_jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Run on http://localhost:8080/
@Controller
public class ControllerClass {

	@GetMapping(value = "/")

	public String publish() {

		return "homepage";

	}

}
