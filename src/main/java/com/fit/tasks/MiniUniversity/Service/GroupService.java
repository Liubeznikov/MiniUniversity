package com.fit.tasks.MiniUniversity.Service;

import com.fit.tasks.MiniUniversity.domain.Group;

import java.util.List;

public interface GroupService {
    Group addGroup(Group group);
    void deleteGroup(Long id);
    List<Group> getAll();

}
