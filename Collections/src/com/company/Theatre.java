package com.company;

import java.util.*;

public class Theatre {

    // == fields ==

    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

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
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat as " + seatNumber);
            return false;
        }
    }

    // == for testing ==
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public static void printList(List<Seat> list) {
        for (Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("======================================================================");
    }

    public static void sortList(List<? extends Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
