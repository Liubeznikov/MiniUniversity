package com.fit.tasks.MiniUniversity.repository;

import com.fit.tasks.MiniUniversity.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Long> {
}
