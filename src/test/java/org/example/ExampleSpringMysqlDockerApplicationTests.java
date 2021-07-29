package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// Skipping spring context load
//@SpringBootTest
class ExampleSpringMysqlDockerApplicationTests {

	@Test
	@Disabled("For this demostration we do not want to test the context loading as database will no be up yet")
	void contextLoads() {
	}

}
