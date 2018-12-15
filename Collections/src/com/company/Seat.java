package com.company;

public class Seat implements Comparable<Seat> {

    // == fields ==

    private final String seatNumber;
    private double price;
    private boolean reserved = false;

    // == constructors ==

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // == getters and setters

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
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

    @Override
    public int compareTo(Seat seat) {
         return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }
}

