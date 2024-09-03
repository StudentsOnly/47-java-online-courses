import java.util.ArrayList;
import java.util.List;

public class MathCourse implements OnlineCourse {
    private final String courseName;
    private final String instructorName;
    private final List<String> enrolledStudents;

    public MathCourse(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getInstructorName() {
        return instructorName;
    }

    @Override
    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }
}
