package com.drools.controller;

import com.drools.model.IndianCars;
import io.swagger.annotations.ApiOperation;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public record CarController(KieContainer kieContainer) {

	@PostMapping("/cars")
	@ApiOperation("Create a request for car details")
	public IndianCars orderNow(@RequestBody IndianCars indianCars) {

		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(indianCars);
		kieSession.fireAllRules();
		kieSession.dispose();
		return indianCars;
	}

}
