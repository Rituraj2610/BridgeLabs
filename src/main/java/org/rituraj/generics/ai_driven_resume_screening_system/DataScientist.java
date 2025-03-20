package org.rituraj.generics.ai_driven_resume_screening_system;

import java.util.List;

public class DataScientist extends JobRole{


    public DataScientist(String roleName, int experienceRequired, List<String> requiredSkills) {
        super(roleName, experienceRequired, requiredSkills);
    }


//    @Override
//    boolean matchesCriteria(Resume<?> resume) {
//        return false;
//    }

    @Override
    public String toString() {
        return "DataScientist{" +
                super.toString() +
                '}';
    }
}
