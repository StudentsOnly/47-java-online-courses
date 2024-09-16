import java.util.ArrayList;
import java.util.Collections;
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
        // Return an unmodifiable view to prevent external modification
        return Collections.unmodifiableList(enrolledStudents);
    }

    @Override
    public void enrollStudent(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty.");
        }
        if (!enrolledStudents.contains(studentName)) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " has been enrolled in " + courseName + ".");
        } else {
            System.out.println(studentName + " is already enrolled in " + courseName + ".");
        }
    }
}
