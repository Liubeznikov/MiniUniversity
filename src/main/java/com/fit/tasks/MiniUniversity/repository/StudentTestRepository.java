package com.fit.tasks.MiniUniversity.repository;

import com.fit.tasks.MiniUniversity.domain.StudentTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTestRepository extends JpaRepository<StudentTest,Integer> {
}
