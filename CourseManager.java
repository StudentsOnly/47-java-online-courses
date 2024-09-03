import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final List<OnlineCourse> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public void addCourse(OnlineCourse course) {
        courses.add(course);
        System.out.println("Course "+ course.getCourseName() + " added to the manager.");
    }

    public void enrollStudentInCourse(String courseName, String studentName) {
        for (OnlineCourse course : courses) {
            if (course instanceof ProgrammingCourse) {
                ProgrammingCourse programmingCourse = (ProgrammingCourse) course;
                if (programmingCourse.getCourseName().equalsIgnoreCase(courseName)) {
                    programmingCourse.enrollStudent(studentName);
                    return;
                }
            } else if (course instanceof MathCourse) {
                MathCourse mathCourse = (MathCourse) course;
                if (mathCourse.getCourseName().equalsIgnoreCase(courseName)) {
                    mathCourse.enrollStudent(studentName);
                    return;
                }
            }
        }
        System.out.println("Course not found.");
    }

    public void displayAllCourses() {
            System.out.println();
        for (OnlineCourse course : courses) {
            course.displayCourseDetails();
            System.out.println();
        }
    }
}
