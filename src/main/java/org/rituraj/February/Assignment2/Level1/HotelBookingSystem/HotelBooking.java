package org.rituraj.February.Assignment2.Level1.HotelBookingSystem;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking hotelBooking) {
        this.guestName = hotelBooking.guestName;
        this.roomType = hotelBooking.roomType;
        this.nights = hotelBooking.nights;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "guestName='" + guestName + '\'' +
                ", roomType='" + roomType + '\'' +
                ", nights=" + nights +
                '}';
    }
}
