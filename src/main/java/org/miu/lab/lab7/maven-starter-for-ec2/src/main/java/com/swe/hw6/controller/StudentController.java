package com.swe.hw6.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.swe.hw6.model.Student;
import com.swe.hw6.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/students")
public class StudentController {
  private final StudentService studentService;

  public StudentController(StudentService studentService) {
      this.studentService = studentService;
  }

  @GetMapping
  public List<Student> getAllStudents() {
    return studentService.getAllStudents();
  }
}
