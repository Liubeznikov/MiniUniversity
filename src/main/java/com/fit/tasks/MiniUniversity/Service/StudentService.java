package com.fit.tasks.MiniUniversity.Service;

import com.fit.tasks.MiniUniversity.domain.Student;

import java.util.List;

public interface StudentService  {
    Student addStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getAll();
}
