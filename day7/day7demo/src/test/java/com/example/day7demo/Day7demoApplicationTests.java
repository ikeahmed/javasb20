package com.example.day7demo;

import com.example.day7demo.controller.Day7demoController;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

class Day7demoApplicationTests {
@Autowired
Day7demoController dc;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldReturnHello() {
		assertEquals ("Hello", dc.hello());
	}
	@Test
	void should() throws IOException {
		Day7demoController dc2 = Mockito.mock(Day7demoController.class);
		
		assertEquals("Hello",dc2.hello());
	}

}
