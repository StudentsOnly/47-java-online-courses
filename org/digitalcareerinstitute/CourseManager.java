package org.digitalcareerinstitute;

import java.util.*;

public class CourseManager {

    private final List<OnlineCourse> courses;
    private final List<Student> students;

    public CourseManager() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public boolean addCourse(String type, String courseName, String instructorName) {
        courseName = courseName.trim();
        instructorName = instructorName.trim();
        for (var course : this.courses) {   // duplicate protection, courseName unique
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                System.out.println(courseName + " already exists");
                return false;
            }
        }
        OnlineCourse onlineCourse = switch (type.trim().toUpperCase().charAt(0)) {
            default -> new ProgrammingCourse(courseName, instructorName);
            case 'M' -> new MathCourse(courseName, instructorName);
        };
        return this.courses.add(onlineCourse);
    }

    private OnlineCourse getCourse(String courseName) {
        for (var course : this.courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName.trim())) {
                return course;
            }
        }
        return null;
    }

    private Student getStudent(String studentName) {
        for (var student : this.students) {
            if (student.name().equalsIgnoreCase(studentName.trim())) {
                return student;
            }
        }
        return null;
    }

    public boolean addStudents(Collection<? extends Student> students) {
        HashSet studentsHashSet = new LinkedHashSet<Student>();
        students.forEach(student -> {
            if (student != null) {
                studentsHashSet.add(student);
            }
        });
        if (!studentsHashSet.isEmpty()) {
            return this.students.addAll(new HashSet<Student>(students));
        }
        return false;
    }

    public boolean enrollStudent(String courseName, String studentName) {
        courseName = courseName.trim();
        OnlineCourse onlineCourse = getCourse(courseName);
        Student student = getStudent(studentName);
        return onlineCourse != null && student != null && onlineCourse.enrollStudent(student);
    }

    public void displayCourseDetails(String courseName) {
        getCourse(courseName).displayCourseDetails();
    }


}
