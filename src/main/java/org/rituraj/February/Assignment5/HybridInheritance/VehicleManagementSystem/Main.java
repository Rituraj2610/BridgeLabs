package org.rituraj.February.Assignment5.HybridInheritance.VehicleManagementSystem;

public class Main {
        public static void main(String[] args) {
            ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model S", 100);
            PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang", 60);

            System.out.println("Electric Vehicle Info:");
            ev.displayInfo();
            ev.charge();

            System.out.println("\nPetrol Vehicle Info:");
            pv.displayInfo();
            pv.refuel();
        }
}
