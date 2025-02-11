package org.rituraj.February.Assignment5.SingleInheritence.SmartHomeDevices;

public class Main {
    public static void main(String[] args) {
        Device device = new Thermostat(1, "working", "on");

        device.displayInfo();
    }
}
