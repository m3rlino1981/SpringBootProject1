package it.belli.demo;

import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
	

	@Test
	void contextLoads() {
		try(MockedStatic<SpringApplication> springApplication = mockStatic(SpringApplication.class);){
			springApplication.when(()->SpringApplication.run(ArgumentMatchers.<Class>eq(DemoApplication.class), ArgumentMatchers.any()))
			   .thenReturn(null);
			
			DemoApplication.main(new String[] {});
		}
	}

}
