package jc_dz9;

import java.util.List;

public class Students {
    private String name;
    private List<Courses> listCourses;

    public Students(String name, List<Courses> listCourses) {
        this.name = name;
        this.listCourses = listCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Courses> getCourses() {
        return listCourses;
    }

    public void setCourses(List<Courses> courses) {
        this.listCourses = courses;
    }

    @Override
    public String toString() {
        return "Student " + name + listCourses ;
    }




}
