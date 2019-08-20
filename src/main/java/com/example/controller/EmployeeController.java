package com.example.controller;

import com.example.entity.User;
import com.example.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController extends BaseController<User> {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/selectByMap",method = RequestMethod.GET)
    public List<User> selectByMap() {
      return  service.selectByMap(new HashMap<>());
    }

    @RequestMapping(value = "/selectObj",method = RequestMethod.GET)
    public User selectObj() {
        return userService.sel(1);
    }
}
