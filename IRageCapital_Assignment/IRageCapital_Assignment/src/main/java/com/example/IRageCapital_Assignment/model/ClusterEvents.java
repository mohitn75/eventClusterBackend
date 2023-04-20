package com.example.IRageCapital_Assignment.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Getter
@Setter
public class ClusterEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId;
    private String tag1;
    private String tag2;
    private String tag3;
    private double metrics1;
    private double metrics2;

    public ClusterEvents(int eventId, String tag1, String tag2, String tag3, double metrics1, double metrics2) {
        super();
        this.eventId = eventId;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag3 = tag3;
        this.metrics1 = metrics1;
        this.metrics2 = metrics2;
    }

    public ClusterEvents() {
        super();
    }
}
