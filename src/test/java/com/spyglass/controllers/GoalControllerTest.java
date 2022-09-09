package com.spyglass.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("dev")
@ExtendWith(MockitoExtension.class)
public class GoalControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
    @DisplayName("GET /goals/")
    void findAll() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders
        		.get("/goals/"))
                .andExpect(status().isOk());
		
	
	}
	
	@Test
    @DisplayName("GET /goals/{goalId}")
    void findByCouponId() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
        		.get("/goals/{goalId}", 1))
                .andExpect(status().isOk());
	}
	
	
	
	

}
