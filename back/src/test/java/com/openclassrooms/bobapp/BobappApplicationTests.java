package com.openclassrooms.bobapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BobappApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testEnEchec() {
		int a = 5;
		int b = 6;
        assertEquals(a, b, "Test en echec");
	}

}

