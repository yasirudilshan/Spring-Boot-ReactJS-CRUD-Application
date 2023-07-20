package com.student.studentMaagementSystem.controller;

import com.student.studentMaagementSystem.model.Student;
import com.student.studentMaagementSystem.service.StudentService;
import com.student.studentMaagementSystem.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String delete(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}
