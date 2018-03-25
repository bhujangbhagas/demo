package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@Autowired
	private StockRepository stockRepository;

	@RequestMapping(method = RequestMethod.GET)
	public String create() {
		Stock stock = new Stock("SAS", "SAS123");
		stockRepository.save(stock);
		return "demo";
	}

}
