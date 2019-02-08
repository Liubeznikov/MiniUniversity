package com.fit.tasks.MiniUniversity.rest;

import com.fit.tasks.MiniUniversity.Service.Impl.StudentTestServiceImpl;
import com.fit.tasks.MiniUniversity.domain.StudentTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentTestController {

    private Integer studNum = 1;

    private final StudentTestServiceImpl serv;

    @Autowired
    public StudentTestController(StudentTestServiceImpl serv) {
        this.serv = serv;
    }


    @RequestMapping("/studentTest")
    public String addStudentTest(@RequestParam(value="name", defaultValue="Ivan") String name) {
        StudentTest studentTest = new StudentTest();
        studentTest.setId(studNum++);
        studentTest.setName(name);
        serv.addStudentTest(studentTest);
        return studNum.toString() ;
    }

}
