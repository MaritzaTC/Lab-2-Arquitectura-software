package com.udea.lab2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Lab2ApplicationTests {

	@Autowired
	DataController dataController;
	@Test
	void health() {
		assertEquals( "API is running!", dataController.healthCheck());
	}

	@Test
	void version() {
		assertEquals( "Version is 1.0.6-alpha",

				dataController.version());
	}

	@Test
	void nationsLength() {
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength() {
		Integer currenciesLength =
				dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	void aviationLength() {
		Integer aviationLength =
				dataController.getRandomAviation().size();
		assertEquals(20, aviationLength);
	}
}


