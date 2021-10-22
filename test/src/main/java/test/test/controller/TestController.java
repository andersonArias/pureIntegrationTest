package test.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.test.domain.TestEntity;
import test.test.service.TestService;

@RestController
@RequestMapping(path = "api/breeds")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping(value="/list/all")
	public TestEntity response() {
		return testService.response();
	}

}
