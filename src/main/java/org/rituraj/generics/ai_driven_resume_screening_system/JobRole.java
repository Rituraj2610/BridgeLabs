package org.rituraj.generics.ai_driven_resume_screening_system;

import java.util.List;

public abstract class JobRole {
    private String roleName;
    private List<String> requiredSkills;
    private int experienceRequired;

    public JobRole(String roleName, int experienceRequired, List<String> requiredSkills) {
        this.roleName = roleName;
        this.experienceRequired = experienceRequired;
        this.requiredSkills = requiredSkills;
    }

    public String getRoleName() {
        return roleName;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public int getExperienceRequired() {
        return experienceRequired;
    }

    @Override
    public String toString() {
        return "JobRole{" +
                "roleName='" + roleName + '\'' +
                ", requiredSkills=" + requiredSkills +
                ", experienceRequired=" + experienceRequired +
                '}';
    }

//    abstract boolean matchesCriteria(Resume<?> resume);
}
