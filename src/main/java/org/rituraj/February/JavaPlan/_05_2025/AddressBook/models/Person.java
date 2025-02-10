package org.rituraj.February.JavaPlan._05_2025.AddressBook.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private long number;
    private String address;
    private String email;
}
