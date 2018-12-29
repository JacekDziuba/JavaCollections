package com.ListAndMap;

import java.util.*;

public class Theatre {

    // == fields ==

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    // == constructors ==

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        //  (A + 1) = B according to ASCII table in int that is 65 + 1 = 66
        int lastRow = 'A' + (numRows - 1);
        // adding char and int will be int since char is int internally
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if ((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;
                } else if ((row > 'F') || (seatNum < 4|| seatNum > 9)) {
                    price = 7.00;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    // == getters and setters ==

    public String getTheatreName() {
        return theatreName;
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    // == public methods ==

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat as " + seatNumber);
            return false;
        }
    }

    public static void printList(List<Seat> list) {
        for (Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $ " + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }


}
