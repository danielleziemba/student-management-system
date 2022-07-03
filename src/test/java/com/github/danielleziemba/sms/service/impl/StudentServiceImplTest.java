package com.github.danielleziemba.sms.service.impl;

import com.github.danielleziemba.sms.entity.Student;
import com.github.danielleziemba.sms.repository.StudentRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class StudentServiceImplTest {

    private StudentRepository testStudentRepository;

    @Test
    void getAllStudentsReturnsListOfStudents() {
        testStudentRepository = mock(StudentRepository.class);
        StudentServiceImpl studentService = new StudentServiceImpl(testStudentRepository);
        List<Student> students = studentService.getAllStudents();

    }
}