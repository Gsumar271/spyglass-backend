package com.spyglass.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@AutoConfigureMockMvc()
@ActiveProfiles("dev")
public class GoalServiceTest {
	
	@Autowired
	private GoalService goalService;
	
	@Test
	void findAll() {
		assertTrue(!this.goalService.findAll().isEmpty());
	}
	
	
	@Test
	void findById() {
		assertTrue(this.goalService.findById(2L) != null);
		
	}
	
	
	

}
