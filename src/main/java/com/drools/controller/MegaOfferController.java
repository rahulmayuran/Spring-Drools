package com.drools.controller;

import com.drools.model.Order;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public record MegaOfferController(KieContainer kieContainer) {

	@PostMapping("/order")
	public Order orderNow(@RequestBody Order order) {

		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(order);
		kieSession.fireAllRules();
		kieSession.dispose();;
		return order;
	}

}
