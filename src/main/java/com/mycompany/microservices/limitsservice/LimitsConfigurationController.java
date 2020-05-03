package com.mycompany.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.microservices.limitsservice.bean.LimitConfiguration;;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromconfiguration() {
		
		//Get values from properties file
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
