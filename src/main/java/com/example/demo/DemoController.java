package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String demo() {
		return "spring boot demo api";
	}

}
