package org.rituraj.generics.ai_driven_resume_screening_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScreeningSystem {
    public static void main(String[] args) {

        DataScientist dataScientist = new DataScientist("Data Scientist", 3, Arrays.asList("Machine Learning", "Data Analysis", "Python"));
        ProductManager productManager = new ProductManager("Product Manager",  5, Arrays.asList("Leadership", "Business Strategy", "Agile"));
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Software Engineer",  2, Arrays.asList("Java", "Spring Boot", "Microservices"));

        JobList<JobRole> jobList = new JobList<>();
        jobList.addRole(dataScientist);
        jobList.addRole(productManager);
        jobList.addRole(softwareEngineer);

        List<Resume<? extends JobRole>> resumes = Arrays.asList(
                new Resume<>(
                        "Alice Johnson", 3, Arrays.asList("Java", "Spring Boot", "Microservices"),
                        new SoftwareEngineer("Software Engineer",  2, Arrays.asList("Java", "Spring Boot", "Microservices"))
                ),
                new Resume<>(
                        "Bob Smith", 4, Arrays.asList("Python", "Data Analysis", "TensorFlow"),
                        new DataScientist("Data Scientist",  3, Arrays.asList("Machine Learning", "Data Analysis", "Python"))
                ),
                new Resume<>(
                        "Charlie Brown", 6, Arrays.asList("Leadership", "Agile", "Scrum"),
                        new ProductManager("Product Manager",  5, Arrays.asList("Leadership", "Business Strategy", "Agile"))
                ),
                new Resume<>(
                        "David Lee", 1, Arrays.asList("C++", "Game Development"),
                        new SoftwareEngineer("Software Engineer",  2, Arrays.asList("Java", "Spring Boot", "Microservices"))
                )
        );

        ScreeningUtil.isQualified(jobList.getJobRolesList(), resumes);



    }
}
