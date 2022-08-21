package com.droege.studentsystem.service;

import com.droege.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
