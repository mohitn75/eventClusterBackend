package com.example.IRageCapital_Assignment.serviceimpl;

import com.example.IRageCapital_Assignment.model.ClusterEvents;
import com.example.IRageCapital_Assignment.repo.ClusterEventsRepo;
import com.example.IRageCapital_Assignment.serviceinterface.ClusterEventsInterface;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Data
@Service
@Transactional
public class ClusterEventsService implements ClusterEventsInterface {

    @Autowired
    private ClusterEventsRepo clusterEventsRepo;

    @Override
    public void saveClusterEvents(com.example.IRageCapital_Assignment.model.ClusterEvents clusterEvents) {
        clusterEventsRepo.save(clusterEvents);
    }

    @Override
    public void updateClusterEvents(Integer clusterEventsId, ClusterEvents clusterEvents) {
        // TODO Auto-generated method stub
        Optional<ClusterEvents> clusterEvents1 = clusterEventsRepo.findById(clusterEventsId);
        ClusterEvents clusterEvents2 = clusterEvents1.get();
        clusterEvents2.setTag1(clusterEvents.getTag1());
        clusterEvents2.setTag2(clusterEvents.getTag2());
        clusterEvents2.setTag3(clusterEvents.getTag3());
        clusterEvents2.setMetrics1(clusterEvents.getMetrics1());
        clusterEvents2.setMetrics2(clusterEvents.getMetrics2());
    }

    @Override
    public void deleteClusterEvents(int id) {
        clusterEventsRepo.deleteById(id);

    }

    @Override
    public List<com.example.IRageCapital_Assignment.model.ClusterEvents> getAllClusterEvents() {
        // TODO Auto-generated method stub
        return (List<com.example.IRageCapital_Assignment.model.ClusterEvents>) clusterEventsRepo.findAll();
    }


}
