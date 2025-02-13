package org.rituraj.February.assignment4.self_problems.hospital_doctors_and_patients;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this);
        }
    }

    public void viewDoctors() {
        System.out.println("Doctors for " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
    }
}
