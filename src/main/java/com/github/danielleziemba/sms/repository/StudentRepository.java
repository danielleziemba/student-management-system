package com.github.danielleziemba.sms.repository;

import com.github.danielleziemba.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
