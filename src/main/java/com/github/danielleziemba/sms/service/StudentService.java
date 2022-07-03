package com.github.danielleziemba.sms.service;

import com.github.danielleziemba.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
