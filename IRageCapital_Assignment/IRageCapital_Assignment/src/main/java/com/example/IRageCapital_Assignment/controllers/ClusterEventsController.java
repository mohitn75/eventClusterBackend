package com.example.IRageCapital_Assignment.controllers;

import com.example.IRageCapital_Assignment.model.ClusterEvents;
import com.example.IRageCapital_Assignment.serviceimpl.ClusterEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClusterEventsController {

    @Autowired
    private ClusterEventsService empImpl;

    Boolean firstRender = true;

    @GetMapping(value = "/initialAdditionOfClusterEvents")
    @CrossOrigin
    public String addClusterEvents() {
        for (int i = 0; i < 100; i++) {
            ClusterEvents clusterEventsTobeAdded = new ClusterEvents();
            clusterEventsTobeAdded.setTag1("Sample Tag 1");
            clusterEventsTobeAdded.setTag2("Sample Tag 2");
            clusterEventsTobeAdded.setTag3("Sample Tag 3");
            clusterEventsTobeAdded.setMetrics1(((Math.random() * 900) + 100) / 100.0);
            clusterEventsTobeAdded.setMetrics2(((Math.random() * 900) + 100) / 100.0);
            empImpl.saveClusterEvents(clusterEventsTobeAdded);
        }
        return "Added Successfully";
    }

    @PostMapping(value = "addClusterEvents")
    @CrossOrigin
    public String addNewClusterEvents(@RequestBody ClusterEvents clusterEvents) {
        empImpl.saveClusterEvents(clusterEvents);
        return "Added Successfully";
    }

    @PutMapping(value = "/updateClusterEvents/{clusterEventsId}")
    @CrossOrigin
    public String updateEmp(@PathVariable(value = "clusterEventsId") Integer clusterEventsId, @RequestBody ClusterEvents clusterEvents) {
        empImpl.updateClusterEvents(clusterEventsId, clusterEvents);
        return "Update successful";
    }

    @PutMapping(value = "deleteClusterEvents/{clusterEventsId}")
    @CrossOrigin
    public String deleteClusterEvents(@PathVariable(value = "clusterEventsId") Integer clusterEventsId) {
        empImpl.deleteClusterEvents(clusterEventsId);
        return "ClusterEvent Deleted";
    }

    @GetMapping(value = "findAllClusterEvents")
    @CrossOrigin
    public List<ClusterEvents> findAllEmployee() {
        if(firstRender){
            addClusterEvents();
            firstRender=false;
        }
        return empImpl.getAllClusterEvents();
    }
}
