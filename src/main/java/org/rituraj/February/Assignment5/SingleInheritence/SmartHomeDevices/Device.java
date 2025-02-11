package org.rituraj.February.Assignment5.SingleInheritence.SmartHomeDevices;

public class Device {
    private int deviceId;
    private String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayInfo(){
        System.out.printf("DeviceId: %d, Status: %s", deviceId, status);
    }
}
