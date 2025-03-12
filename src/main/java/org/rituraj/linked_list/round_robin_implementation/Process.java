package org.rituraj.linked_list.round_robin_implementation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Process {
    private int id;
    private int burstTime;
    private int priority;


}
