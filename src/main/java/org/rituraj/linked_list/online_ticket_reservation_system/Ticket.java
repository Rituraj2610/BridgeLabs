package org.rituraj.linked_list.online_ticket_reservation_system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket {
    private int id;
    private String customer;
    private String movieName;
    private int seatNumber;
    private LocalDateTime bookingTime;
}
