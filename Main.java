public class Main {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        manager.addCourse(new ProgrammingCourse("OPC-15", "John"));
        manager.addCourse(new ProgrammingCourse("OPC-17", "Bob"));
        manager.addCourse(new ProgrammingCourse("OMC-19", "John"));

        manager.enrollStudent("Alex", "OPC-15");
        manager.enrollStudent("Elena", "Wrong course name");
        manager.enrollStudent("Elena", "OMC-19");

        manager.displayCourseDetails("Wrong name");
        System.out.println();
        manager.displayCourseDetails("OPC-15");
        System.out.println();
        manager.displayCourseDetails("OPC-17");
        System.out.println();
        manager.displayCourseDetails("OMC-19");
    }

}
