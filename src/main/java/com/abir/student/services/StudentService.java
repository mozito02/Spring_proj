package com.abir.student.services;

import com.abir.student.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
    Student deleteStudentById(Long id);
}
