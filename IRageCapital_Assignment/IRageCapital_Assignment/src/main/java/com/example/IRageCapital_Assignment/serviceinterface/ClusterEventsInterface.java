package com.example.IRageCapital_Assignment.serviceinterface;

import com.example.IRageCapital_Assignment.model.ClusterEvents;

import java.util.List;

public interface ClusterEventsInterface {
    public void saveClusterEvents(ClusterEvents clusterEvents);

    public void updateClusterEvents(Integer clusterEventsId, ClusterEvents clusterEvents);

    public void deleteClusterEvents(int id);

    public List<ClusterEvents> getAllClusterEvents();

}
