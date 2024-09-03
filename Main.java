public class Main {
    public static void main(String[] args) {
        // Create instances of ProgrammingCourse and MathCourse
        ProgrammingCourse javaCourse = new ProgrammingCourse("Java Programming", "Dr. Johnson");
        MathCourse algebraCourse = new MathCourse("Math Course", "Dr. Smith");

        // Create a CourseManager and add the courses
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(javaCourse);
        courseManager.addCourse(algebraCourse);

        // Enroll students in courses
        courseManager.enrollStudentInCourse("Java Programming", "Olga Babina");
        courseManager.enrollStudentInCourse("Math Course", "Olena Shcherbina");
        courseManager.enrollStudentInCourse("Java Programming", "Michael Kopp");
        courseManager.enrollStudentInCourse("Math Course", "Raul Eduarte");

        // Display all courses
        courseManager.displayAllCourses();
    }
}
