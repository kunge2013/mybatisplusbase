package com.example.controller;

import com.example.entity.User;
import com.example.service.impl.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

@Api(tags = "用户接口",description="人员文档说明",hidden=true)
@RestController
public class UserController extends BaseController<User> {

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
