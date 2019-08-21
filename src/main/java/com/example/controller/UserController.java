package com.example.controller;

import com.example.entity.User;
import com.example.service.IUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户接口",description="人员文档说明",hidden=true)
@RestController
public class UserController extends BaseController<User> {

}
