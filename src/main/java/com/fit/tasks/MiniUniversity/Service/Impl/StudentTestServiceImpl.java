package com.fit.tasks.MiniUniversity.Service.Impl;

import com.fit.tasks.MiniUniversity.Service.StudentTestService;
import com.fit.tasks.MiniUniversity.domain.StudentTest;
import com.fit.tasks.MiniUniversity.repository.StudentTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentTestServiceImpl implements StudentTestService {


    private final StudentTestRepository repository;

    @Autowired
    public StudentTestServiceImpl(StudentTestRepository repository) {
        this.repository = repository;
    }


    @Override
    public void addStudentTest(StudentTest studentTest) {

           repository.save(studentTest);

    }
}
