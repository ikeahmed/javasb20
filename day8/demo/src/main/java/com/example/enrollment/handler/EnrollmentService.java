package com.example.enrollment.handler;

import com.example.enrollment.model.Course;
import com.example.enrollment.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Component
public class EnrollmentService {
    private static  List<Student> students = new ArrayList<> ();
    private static List<Course> courses =  new ArrayList<>();
    static {
       students.add(new Student("Ikhlas","Ahmed","ike.ahmed@outlook.com","1"));
       students.add(new Student("Mohammed","Tahir","mtahir1000@gmail.com","4"));
       students.add(new Student("Anees", "Begum","roshanhhold@gmail.com","5"));
       students.add(new Student("Herman", "Muchtar","hmuchtar@gmail.com","13"));

       courses.add(new Course("Java Spring boot", "Masjid Rahman","JSB102"));
       courses.add(new Course("Amamzon Web Service","EPIC","AWS101"));
       courses.add(new Course("Angular Programming","Plano Masjid","ANG101"));

       courses.get(0).addStudentId("1");
       students.get(0).addCourseId("JSB102");

       courses.get(0).addStudentId("4");
       students.get(1).addCourseId("JSB102");

       courses.get(2).addStudentId("4");
       students.get(1).addCourseId("ANG101");

    }

    public Student retrieveStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public Course retrieveCourse(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public boolean enrollInACourse(String studentId, String courseId) {
        boolean ret = false;
        Course course = retrieveCourse(courseId);
        if (course != null)
        {
            Student student = retrieveStudent(studentId);
            if (student != null) {
                student.addCourseId(courseId);
                course.addStudentId(studentId);
                ret = true;
            }
        }
        return ret;
    }

    public List<Course> retrieveCoursesForAStudent(String studentId) {
        Student student = retrieveStudent(studentId);
        List<Course> list = new ArrayList<>();
        if (student != null) {
            for (String courseId : student.getCourseIds())
                list.add(retrieveCourse(courseId));
        }
        return list;
    }

    public List<Student> retrieveStudentsForACourse(String courseId) {
        Course course = retrieveCourse(courseId);
        List<Student> list = new ArrayList<>();
        if (course != null) {
            for (String studentId : course.getStudentIds())
                list.add(retrieveStudent(studentId));
        }
        return list;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
