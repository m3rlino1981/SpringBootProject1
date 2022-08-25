package it.belli.demo.controller.application;

import static org.mockito.Mockito.inOrder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainControllerTests {

	
	private MainController sut = new MainController();

	@Test
	void contextLoads() {
		sut.helloWorld();
		
	}
}
