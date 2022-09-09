package com.spyglass.repositories;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.spyglass.data.GoalRepository;
import com.spyglass.models.Goal;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("dev")
@ExtendWith(MockitoExtension.class)
public class GoalRepositoryTest {
	
	@Autowired
	private GoalRepository repository;
	
	void findAllTest() {
		assertNotNull(repository);
		List<Goal> test = (List<Goal>) repository.findAll();
		assertFalse(test.isEmpty());
		
	}
	
	void findByIdTest() {
		assertNotNull(repository);
		Optional<Goal> test = repository.findById((long) 1);
		assertNotNull(test);
		
	}
	
	

}
