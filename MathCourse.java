import java.util.ArrayList;
import java.util.Objects;

public class MathCourse implements OnlineCourse {
    private String courseName;
    private String instructorName;
    private ArrayList<String> students;

    public MathCourse(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        students = new ArrayList<>();
    }

    @Override
    public void enrollStudent(String name) {
        students.add(name);
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor name: " + instructorName);

        if (students.isEmpty()) {
            System.out.println("No students");
        } else {
            System.out.println("Students:");
            students.forEach(System.out::println);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathCourse that = (MathCourse) o;
        return Objects.equals(courseName, that.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(courseName);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }
}
