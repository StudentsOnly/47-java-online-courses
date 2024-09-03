package org.digitalcareerinstitute;

import java.util.Collection;

public interface OnlineCourse {

    <T extends Student> boolean enrollStudent(T student);
    <T extends Student> boolean enrollStudentS(Collection<T> students);

    default void displayCourseDetails() {
        System.out.println(this.toString());
    };

    String getCourseName();
}
