package com.example.Open_Bootcamp_Spring_deploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class OpenBootcampSpringDeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key,value) -> System.out.println(key + " " + value)

		);
	}

}
