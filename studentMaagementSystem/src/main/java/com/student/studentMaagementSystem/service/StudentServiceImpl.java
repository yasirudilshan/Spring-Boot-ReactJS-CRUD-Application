package com.student.studentMaagementSystem.service;

import com.student.studentMaagementSystem.model.Student;
import com.student.studentMaagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Deleted";
    }
}
