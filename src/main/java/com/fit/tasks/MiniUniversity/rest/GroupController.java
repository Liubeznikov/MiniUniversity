package com.fit.tasks.MiniUniversity.rest;

import com.fit.tasks.MiniUniversity.Service.GroupService;
import com.fit.tasks.MiniUniversity.Service.Impl.GroupServiceImpl;
import com.fit.tasks.MiniUniversity.domain.Group;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {
    private GroupServiceImpl groupServiceImpl = new GroupServiceImpl() ;

    @RequestMapping("/group")
    public String addGroup(@RequestParam(value = "name", defaultValue = "A") String name){
       // return name;

      return groupServiceImpl.addGroup(new Group("Test")).toString();
    }

}
