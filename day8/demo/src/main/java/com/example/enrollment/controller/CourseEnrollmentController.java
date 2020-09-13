package com.example.enrollment.controller;

import com.example.enrollment.handler.EnrollmentService;
import com.example.enrollment.handler.StudentsCoursesMapping;
import com.example.enrollment.model.Course;
import com.example.enrollment.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CourseEnrollmentController {

@Autowired private EnrollmentService enrollmentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return enrollmentService.getStudents();
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return enrollmentService.getCourses();
    }

    @GetMapping("/students/{studentId}")
        public Student getStudentDetails(@PathVariable String studentId) {
        return  enrollmentService.retrieveStudent(studentId);
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseDetails(@PathVariable String courseId) {
        return enrollmentService.retrieveCourse(courseId);
    }

    @PostMapping("/students")
    public String createStudent(@RequestBody Student student) {
        enrollmentService.addStudent(student);
        return "success";
    }

    @PostMapping("/courses")
    public String createCourse(@RequestBody Course course) {
        enrollmentService.addCourse(course);
        return "success";
    }

    @GetMapping("/students/{studentId}/courses")
    public List<Course> retrieveCoursesForAStudent(@PathVariable String studentId)
    {
        return enrollmentService.retrieveCoursesForAStudent(studentId);
    }

    @GetMapping("/courses/{courseId}/students")
    public List<Student> retrieveStudentsForACourse(@PathVariable String courseId)
    {
        return enrollmentService.retrieveStudentsForACourse(courseId);
    }
    @PostMapping("/enroll")
    public String enroll(@RequestBody Map<String, String> json) {
        String studentId = json.get("studentId");
        String courseId = json.get("courseId");
        boolean ret = enrollmentService.enrollInACourse(studentId, courseId);
        return ret ? "Success": "Failure";
    }
    @GetMapping("/enroll")
    public List<StudentsCoursesMapping> getStudentsCoursesMapping() {
        return enrollmentService.getStudentsCoursesMappings();
    }

}
