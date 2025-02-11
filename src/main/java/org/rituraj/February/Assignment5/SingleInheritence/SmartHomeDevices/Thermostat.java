package org.rituraj.February.Assignment5.SingleInheritence.SmartHomeDevices;

public class Thermostat extends Device{

    private String tempSettings;
    public Thermostat(int deviceId, String status, String tempSettings) {
        super(deviceId, status);
        this.tempSettings = tempSettings;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.printf("Tempsettings: %s %n", tempSettings);
    }
}
