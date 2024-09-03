package org.digitalcareerinstitute;

import java.util.*;

public class Main{

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ralf"),
                new Student("Gabi"),
                new Student("Frank"),
                new Student("Fred"),
                new Student("Gabi"),
                new Student("Frank"),
                new Student("Fred")
        );

        CourseManager courseManager = new CourseManager();
        courseManager.addStudents(students);
        courseManager.addCourse("Programming", "Java for Back-End", "DCI Instructor");
        courseManager.addCourse("Math", "Complex Numbers", "Prof. Dr. Joe Black");

        List<String> courseNames = Arrays.asList("Java for Back-End", "Complex Numbers");

        System.out.println("""
                Courses
                ---------------""");

        Random rand = new Random();

        students = new ArrayList<>(new HashSet(students));

        for (String courseName : courseNames) {
            Collections.shuffle(students);
            for (int i = 0; i < rand.nextInt(students.size()); i++) {
                courseManager.enrollStudent(courseName, students.get(i).name());
            }
            courseManager.displayCourseDetails(courseName);
        }

    }
}
