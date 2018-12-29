package com.MapAndSet;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    // == fields ==

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    // == constructors ==

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    // == getters ==

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    // == public methods ==

    public boolean addMoon (HeavenlyBody moon) {
        return this.satellites.add(moon);
    }


}
