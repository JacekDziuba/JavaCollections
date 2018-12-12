package com.company;

public class Seat {

    // == fields ==

    private final String seatNumber;
    private boolean reserved = false;

    // == constructors ==

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // == getters and setters

    public String getSeatNumber() {
        return seatNumber;
    }

    // == public methods ==

    public boolean reserve() {
        if (!this.reserved) {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancel() {
        if (this.reserved) {
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled");
            return true;
        } else {
            return false;
        }
    }

}

