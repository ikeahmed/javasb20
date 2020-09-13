package com.example.enrollment.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String offeredBy;
    private String courseId;
    private List<String> studentIds;

    public Course(String name, String offeredBy, String courseId) {
        this.name = name;
        this.offeredBy = offeredBy;
        this.courseId = courseId;
        this.studentIds  = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getOfferedBy() {
        return offeredBy;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public List<String> getStudentIds() {
        return studentIds;
    }

    public void addStudentId(String studentId) {
        this.studentIds.add(studentId);
    }
}
