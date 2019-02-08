package com.fit.tasks.MiniUniversity.domain;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    protected Long id;

    protected String name;

    protected Integer age;

    @ManyToOne
    protected Group group;


}
