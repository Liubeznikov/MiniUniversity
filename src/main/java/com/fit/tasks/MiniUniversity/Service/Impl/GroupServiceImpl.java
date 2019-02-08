package com.fit.tasks.MiniUniversity.Service.Impl;

import com.fit.tasks.MiniUniversity.Service.GroupService;
import com.fit.tasks.MiniUniversity.domain.Group;
import com.fit.tasks.MiniUniversity.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupRepository groupRepository;

    @Override
    public Group addGroup(Group group) {
        Group savedGroup = groupRepository.saveAndFlush(group);
        return savedGroup;
    }

    @Override
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    @Override
    public List<Group> getAll() {
       return groupRepository.findAll();
    }
}
