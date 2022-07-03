package com.github.danielleziemba.sms.service.impl;

import com.github.danielleziemba.sms.entity.Student;
import com.github.danielleziemba.sms.repository.StudentRepository;
import com.github.danielleziemba.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}