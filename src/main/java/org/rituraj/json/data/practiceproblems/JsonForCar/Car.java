package org.rituraj.json.data.practiceproblems.JsonForCar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {
    private String name;
    private String type;
    private double price;
}
