package com.fit.tasks.MiniUniversity.repository;

import com.fit.tasks.MiniUniversity.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
