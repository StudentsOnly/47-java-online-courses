package org.digitalcareerinstitute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MathCourse implements OnlineCourse {

    private final String courseName;
    private final String instructorName;
    private final List<Student> students;

    public MathCourse(String courseName, String instructorName) {
        this.courseName = courseName.trim();
        this.instructorName = instructorName.trim();
        this.students = new ArrayList<>();
    }

    @Override
    public final <T extends Student> boolean enrollStudent(T t) {
        return this.students.add(t);
    }

    @Override
    public final <T extends Student> boolean enrollStudentS(Collection<T> students) {
        return this.students.addAll(students);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final String toString() {
        StringBuilder result = new StringBuilder("""
                Students
                ----------
                """);
        final int[] index = {0};
        students.forEach(
                s -> result.append(index[0]++).append(" ").append(s.name()).append("\n")
        );
        return "ProgrammingCourse{" +
                "courseName='" + courseName + '\'' +
                ", instructorName='" + instructorName +
                "}\n" + result;
    }
}
