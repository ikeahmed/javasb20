package com.example.enrollment.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String studentId;
    private List<String> courseIds;

    public Student(String firstName, String lastName, String email, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studentId = studentId;
        this.courseIds =  new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<String> getCourseIds() {
        return courseIds;
    }

    public void addCourseId(String courseId) {
        this.courseIds.add(courseId);
    }
}
