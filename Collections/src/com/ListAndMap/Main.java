package com.ListAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Seat> seatList = new ArrayList<>(theatre.getSeats());
        Collections.reverse(seatList);
        Theatre.printList(seatList);

        List<Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(new Seat("000", 13.00));
        priceSeats.add(new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        Theatre.printList(priceSeats);

    }
}
