package org.rituraj.generics.ai_driven_resume_screening_system;

import java.util.List;

public class SoftwareEngineer extends JobRole{

    public SoftwareEngineer(String roleName, int experienceRequired, List<String> requiredSkills) {
        super(roleName, experienceRequired, requiredSkills);
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                super.toString() +
                '}';
    }

//    @Override
//    boolean matchesCriteria(Resume<?> resume) {
//        return false;
//    }
}
