package org.digitalcareerinstitute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ProgrammingCourse implements OnlineCourse {

    private String courseName;
    private String instructorName;
    final private List<Student> students;

    public ProgrammingCourse(String courseName, String instructorName) {
        this.courseName = courseName.trim();
        this.instructorName = instructorName.trim();
        this.students = new ArrayList<>();
    }

    @Override
    public <T extends Student> boolean enrollStudent(T t) {
        return this.students.add(t);
    }

    @Override
    public <T extends Student> boolean enrollStudentS(Collection<T> students) {
        return this.students.addAll(students);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
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
