package com.openclassrooms.bobapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;  // ajout pour test à supprimer
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BobappApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void thisWillDefinitelyFail() {
        fail("Échec forcé pour tester le workflow");
    }  
}

