package org.rituraj.generics.ai_driven_resume_screening_system;

import java.util.List;

public class ProductManager extends JobRole{
    public ProductManager(String roleName, int experienceRequired, List<String> requiredSkills) {
        super(roleName, experienceRequired, requiredSkills);
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                super.toString() +
                '}';
    }

//    @Override
//    boolean matchesCriteria(Resume<?> resume) {
//        return false;
//    }
}
