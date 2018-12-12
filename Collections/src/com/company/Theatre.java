package com.company;

import java.util.*;

public class Theatre {

    // == fields ==

    private final String theatreName;
    private Collection<Seat> seats = new ArrayList<>();

    // == constructors ==

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        //  (A + 1) = B according to ASCII table in int that is 65 + 1 = 66
        int lastRow = 'A' + (numRows - 1);
        // adding char and int will be int since char is int internally
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    // == getters and setters ==

    public String getTheatreName() {
        return theatreName;
    }

    // == public methods ==

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            System.out.print(".");
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    // == for testing ==
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }


}
