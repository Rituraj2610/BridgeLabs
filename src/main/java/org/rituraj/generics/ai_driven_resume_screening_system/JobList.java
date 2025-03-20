package org.rituraj.generics.ai_driven_resume_screening_system;

import java.util.ArrayList;
import java.util.List;

public class JobList <T extends JobRole> {
    private List<T> jobRolesList = new ArrayList<>();

    public void addRole(T jobRole) {
        jobRolesList.add(jobRole);
    }

    public List<? extends JobRole> getJobRolesList() { // Return as wildcard
        return jobRolesList;
    }
}
