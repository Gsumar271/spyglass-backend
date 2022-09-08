package com.spyglass.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spyglass.models.Goal;

@Repository
public interface GoalRepository extends CrudRepository<Goal, Long> {

}
