package org.rituraj.generics.ai_driven_resume_screening_system;

import java.util.List;

public class ScreeningUtil {
    public static void isQualified(List<? extends JobRole> jobRoles, List<Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> resume : resumes) {
            for (JobRole jobRole : jobRoles) {
                if (resume.getJobRole().getRoleName().equals(jobRole.getRoleName()) &&
                        resume.getJobRole().getExperienceRequired() == jobRole.getExperienceRequired() &&
                        resume.getJobRole().getRequiredSkills().equals(jobRole.getRequiredSkills())) {

                    System.out.println(resume + " is compatible with the Job Role: " + jobRole);
                }
            }
        }
    }

}
