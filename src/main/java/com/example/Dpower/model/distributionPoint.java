package com.example.Dpower.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class distributionPoint {
    private  String dpName;
    private  UUID id;
    private  int dpLimit;
    private  int dpSlotAvailable;
    private   int dpSlotUsed;
    private  String dpPoleLocation;


    public distributionPoint(@JsonProperty("dpName") String dpName, @JsonProperty("id") UUID dpId,@JsonProperty("dpLimit") int dpLimit,@JsonProperty("dpSlotAvailable") int dpSlotAvailable,@JsonProperty("dpSlotUsed") int dpSlotUsed,@JsonProperty("dpPoleLocation") String dpPoleLocation) {
        this.dpName = dpName;
        this.id = dpId;
        this.dpLimit = dpLimit;
        this.dpSlotAvailable = dpSlotAvailable;
        this.dpSlotUsed = dpSlotUsed;
        this.dpPoleLocation = dpPoleLocation;
    }

    public  String getDpName() {
        return dpName;
    }

    public UUID getId() {
        return id;
    }

    public int getDpLimit() {
        return dpLimit;
    }

    public int getDpSlotAvailable() {
        return dpSlotAvailable;
    }

    public int getDpSlotUsed() {
        return dpSlotUsed;
    }

    public String getDpPoleLocation() {
        return dpPoleLocation;
    }
}
