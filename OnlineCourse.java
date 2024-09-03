import java.util.List;

public interface OnlineCourse {
    String getCourseName();
    String getInstructorName();
    List<String> getEnrolledStudents();

    default void enrollStudent(String studentName) {
        getEnrolledStudents().add(studentName);
        System.out.println(studentName + " has been enrolled in the course: " + getCourseName());
    }

    default void displayCourseDetails() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructor: " + getInstructorName());
        System.out.println("Enrolled Students: " + getEnrolledStudents());
    }
}
