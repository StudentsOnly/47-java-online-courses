import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final List<OnlineCourse> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public void addCourse(OnlineCourse course) {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null.");
        }
        courses.add(course);
        System.out.println("Course " + course.getCourseName() + " added to the manager.");
    }

    public void enrollStudentInCourse(String courseName, String studentName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be null or empty.");
        }
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty.");
        }

        boolean courseFound = false;
        for (OnlineCourse course : courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                course.enrollStudent(studentName);
                courseFound = true;
                break;
            }
        }

        if (!courseFound) {
            System.out.println("Course not found.");
        }
    }

    public void displayAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("All Courses:");
        for (OnlineCourse course : courses) {
            course.displayCourseDetails();
            System.out.println();
        }
    }
}
