import java.util.ArrayList;
import java.util.List;

public class ProgrammingCourse implements OnlineCourse {
    private final String courseName;
    private final String instructorName;
    private final List<String> enrolledStudents;

    public ProgrammingCourse(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.enrolledStudents = new ArrayList<>();
    }


    public String getCourseName() {
        return courseName;
    }


    public String getInstructorName() {
        return instructorName;
    }


    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }
}
