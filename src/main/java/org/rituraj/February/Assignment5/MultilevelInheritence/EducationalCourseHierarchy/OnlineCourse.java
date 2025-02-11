package org.rituraj.February.Assignment5.MultilevelInheritence.EducationalCourseHierarchy;

public class OnlineCourse extends Course{
        private String platform;
        private boolean isRecorded;

        public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
            super(courseName, duration);
            this.platform = platform;
            this.isRecorded = isRecorded;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public boolean isRecorded() {
            return isRecorded;
        }

        public void setRecorded(boolean recorded) {
            isRecorded = recorded;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Platform: " + platform);
            System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
        }

}
