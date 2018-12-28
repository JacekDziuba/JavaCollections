package com.adventureGame;

import java.util.HashMap;
import java.util.Map;

public class Location {

    // == fields ==

    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    // == constructors ==

    public Location(int locationId, String description, Map<String, Integer> exits) {
        this.locationId = locationId;
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }

    // == getters ==

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    // == public methods ==

//    public void addExit (String direction, int location) {
//        exits.put(direction, location);
//    }


}
