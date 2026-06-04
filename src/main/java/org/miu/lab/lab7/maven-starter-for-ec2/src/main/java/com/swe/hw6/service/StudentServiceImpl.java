package com.swe.hw6.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.swe.hw6.model.Student;


@Service
public class StudentServiceImpl implements StudentService {
    private final List<Student> students = new ArrayList<>();
    public StudentServiceImpl() {
        // Initialize with some sample data
        students.add(new Student("1", "Alice", "alice@example.com"));
        students.add(new Student("2", "Bob", "bob@example.com"));
        students.add(new Student("3", "Charlie", "charlie@example.com"));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}
