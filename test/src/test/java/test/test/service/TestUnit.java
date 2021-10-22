package test.test.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUnit {
	
	private TestService testService = new TestService();
	
	@Test
	void getResponseStatus() {
		Assertions.assertThat(testService.response().getStatus()).isEqualTo("Success");
	} 
	
	@Test
	void getResponseMessage() {
		Assertions.assertThat(testService.response().getMessage()).isNotEmpty();
	}
	
}
