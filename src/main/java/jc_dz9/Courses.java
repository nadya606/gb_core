package jc_dz9;

import java.util.Objects;

public class Courses {
    private static Object name;
    private String courseName;

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course " + courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Courses course = (Courses) o;
        return Objects.equals(name, course.name);
    }

}
