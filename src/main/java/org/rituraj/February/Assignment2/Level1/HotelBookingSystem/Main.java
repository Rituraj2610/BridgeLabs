package org.rituraj.February.Assignment2.Level1.HotelBookingSystem;

public class Main {
    public static void main(String[] args) {
        HotelBooking hotelBooking1 = new HotelBooking();
        hotelBooking1.setGuestName("A");
        hotelBooking1.setNights(2);
        hotelBooking1.setRoomType("Luxury");

        HotelBooking hotelBooking2 = new HotelBooking("B", "Deluxe", 5);

        HotelBooking hotelBooking3 = new HotelBooking(hotelBooking2);

        System.out.println(hotelBooking1);
        System.out.println(hotelBooking2);
        System.out.println(hotelBooking3);




    }
}
