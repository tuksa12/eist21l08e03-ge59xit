package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final List<Course> courseList = new ArrayList<Course>();

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course) {
        this.courseList.add(course);
    }
}
