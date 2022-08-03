package com.example.limitexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitexample.configuration.ConfigurationClass;
import com.example.limitexample.model.Limit;

@RestController
public class LimitExampleController {
	
	@Autowired
	private ConfigurationClass configuration;
	
	@GetMapping("/limits")
	public Limit retreiveLimits() {
		
		return new Limit(configuration.getMinimum()
					,configuration.getMaximum());
	}

}
