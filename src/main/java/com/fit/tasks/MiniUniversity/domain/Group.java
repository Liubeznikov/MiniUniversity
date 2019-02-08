package com.fit.tasks.MiniUniversity.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.soap.Name;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Groups")
public class Group {


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id")
    private Long id;



    @NotNull
    private String name;

    //@OneToMany
  //  protected Set<Student> students = new HashSet<Student>();

    public Group(String name){
        this.name = name;
    }

    public Group(){
    }

    @Override
    public String toString() {
        return "{" + name + "}" ;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
