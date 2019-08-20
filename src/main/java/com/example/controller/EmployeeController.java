package com.example.controller;

import com.example.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController extends BaseController<User> {

    @RequestMapping(value = "/selectByMap",method = RequestMethod.GET)
    public List<User> selectByMap() {
      return  service.selectByMap(new HashMap<>());
    }
}
