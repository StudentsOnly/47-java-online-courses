## Exercise: Interfaces - Online Courses

#### Objective:

Practice working with interfaces and the final keyword in Java by creating an online course management system.

#### Description:

You should create an interface called OnlineCourse with methods for managing online courses such as enrolling students and displaying course details. Implement two classes, ProgrammingCourse and MathCourse, both of which implement the OnlineCourse interface. Additionally, create a class CourseManager to manage the courses and enroll students.

#### Guidelines:

#### OnlineCourse Interface:

Create an interface called OnlineCourse with the following methods:

- enrollStudent - to enroll a student in the course.
- displayCourseDetails - to display course details.

#### ProgrammingCourse Class:

Create a class called ProgrammingCourse that implements the OnlineCourse interface.
Include instance variables for the course name and instructor name.

#### Implement the methods:

- enrollStudent - Add the student to the list of enrolled students.
- displayCourseDetails - Display course details including the course name, instructor name, and enrolled students.

#### MathCourse Class:

Create a class called MathCourse that also implements the OnlineCourse interface.
Include instance variables for the course name and instructor name.

#### Implement the methods:

- enrollStudent - Add the student to the list of enrolled students.
- displayCourseDetails - Display course details including the course name, instructor name, and enrolled students.

#### CourseManager Class:

Create a class called CourseManager that maintains a list of OnlineCourse items (programming and math courses).
Include methods to add courses to the manager, enroll students in courses, and display course details.
