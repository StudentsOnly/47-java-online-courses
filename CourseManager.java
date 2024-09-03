import java.util.ArrayList;

public class CourseManager {
    private ArrayList<OnlineCourse> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public void addCourse(OnlineCourse course) {
        courses.add(course);
    }

    public void enrollStudent(String studentName, String courseName) {
        for (var course : courses) {
            if (course.getCourseName().equals(courseName)) {
                course.enrollStudent(studentName);
                return;
            }
        }
        System.out.println("enrollStudent log: course not found");
    }

    public void displayCourseDetails(String courseName) {
        for (var course : courses) {
            if (course.getCourseName().equals(courseName)) {
                course.displayCourseDetails();
                return;
            }
        }
        System.out.println("displayDetails log: course not found");
    }
}
