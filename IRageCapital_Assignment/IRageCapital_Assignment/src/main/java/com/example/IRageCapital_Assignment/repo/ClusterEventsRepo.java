package com.example.IRageCapital_Assignment.repo;

import com.example.IRageCapital_Assignment.model.ClusterEvents;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterEventsRepo extends CrudRepository<ClusterEvents, Integer> {

}
