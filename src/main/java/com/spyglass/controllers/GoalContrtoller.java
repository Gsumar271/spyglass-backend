package com.spyglass.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spyglass.models.Goal;
import com.spyglass.services.GoalService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/goals")
public class GoalContrtoller {
	
	@Autowired
	private GoalService goalService;
	
	// Read operations
    @GetMapping
    public  ResponseEntity<List<Goal>> findAll() {
    	List<Goal> goals = goalService.findAll();
        return ResponseEntity.ok(goals);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Goal> findById(@PathVariable long id) {
    	Goal goal = goalService.findById(id);
    	return ResponseEntity.ok(goal);
    	
    }

    // Save operation
    @PostMapping
    public ResponseEntity<Goal> save(@Valid @RequestBody Goal goal) {
    	
    	Goal goalTest = goalService.save(goal);
    	
		if(goalTest != null) {
			return ResponseEntity.ok(goalTest);
		}
		// If goal is null then the goal was not valid
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
    
    
    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<Goal> update(@RequestBody Goal goal,
            @PathVariable("id") Long id) {
    	
    	Goal goalTest = goalService.update(goal, id);
    	
		if(goalTest != null) {
			return ResponseEntity.ok(goalTest);
		}
		// If goal is null then the goal was not valid
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
    	goalService.delete(id);
		return ResponseEntity.ok(true);
    }
	
	
	
}
