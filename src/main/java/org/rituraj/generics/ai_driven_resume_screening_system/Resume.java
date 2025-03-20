package org.rituraj.generics.ai_driven_resume_screening_system;

import java.util.List;

public class Resume <T extends JobRole>{
    private String name;
    private int yearOfExperience;
    private List<String> skills;
    private T jobRole;

    public Resume(String name, int yearOfExperience, List<String> skills, T jobRole) {
        this.name = name;
        this.yearOfExperience = yearOfExperience;
        this.skills = skills;
        this.jobRole = jobRole;
    }

    public String getName() {
        return name;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public List<String> getSkills() {
        return skills;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                ", skills=" + skills +
                ", jobRole=" + jobRole +
                '}';
    }
}
