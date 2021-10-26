package jc_dz9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork9 {
    /*1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
2. Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных (любознательность определяется количеством курсов).
3. Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают этот курс.*/

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("John", Arrays.asList(new Courses("Biology"), new Courses("Anatomy"), new Courses("Chemistry"),
                new Courses("Medicine"))));
        students.add(new Students("Mike", Arrays.asList(new Courses("Math"), new Courses("IT"),
                new Courses("Java"))));
        students.add(new Students("Jack", Arrays.asList(new Courses("Java"), new Courses("Analytics"),
                new Courses("Math"), new Courses("Data Bases"))));
        students.add(new Students("Alex", Arrays.asList(new Courses("Geology"),
                new Courses("Chemistry"))));

        System.out.println("Список уникальных курсов: " + students.stream()
                .map(Students::getCourses)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet()));

        System.out.println("Список трех самых любознательных студенов: " + students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()));

        Courses course = new Courses("Math");
        System.out.println("Студенты, посеяющие курс Math: " + students.stream()
                .filter(o -> o.getCourses().contains(course))
                .collect(Collectors.toList()));

    }
}

