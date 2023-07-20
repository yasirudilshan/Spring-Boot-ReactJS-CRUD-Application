package com.student.studentMaagementSystem.service;

import com.student.studentMaagementSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();

    public String deleteStudent(int id);
}
