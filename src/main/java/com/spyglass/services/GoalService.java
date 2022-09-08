package com.spyglass.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spyglass.data.GoalRepository;
import com.spyglass.models.Goal;


@Service
@Transactional
public class GoalService {
	
	@Autowired
	private GoalRepository goalRepository;
	
	
	public List<Goal> findAll(){
		
		return (List<Goal>) goalRepository.findAll();	
	}
	
	public Goal findById(Long id) {
		
		Optional<Goal> goal = goalRepository.findById(id);
		return goal.isPresent() ? goal.get() : null;
	}
	
	public Goal save(Goal goal) {
		
		return goalRepository.save(goal);
	}

	public Goal update(Goal goal, Long id) {
		
		Goal testGoal = goalRepository.findById(id).get();
		
		if (testGoal != null) {
			goal.setId(id);
			return goalRepository.save(goal);
		}
		else 
			return null;
	}
	
	public void delete(Long id) {
		
		goalRepository.deleteById(id);		
	}


}
