package com.user.management.controller;

import com.user.management.entity.UserDetails;
import com.user.management.service.UserService;
import com.user.management.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;
    @PostMapping("/registerUser")
    public String registerUser(@RequestBody UserDetails userDetails)
    {
        Boolean isExist=userServiceImpl.isUserAlreadyExist(userDetails.getEmail());
        if(isExist)
        {
            return  "user already exist";
        }
        else {
            UserDetails userdetail=userServiceImpl.registerUser(userDetails);
           if(userdetail!=null)
           {
               return "user registerd successfully";
           }
           else{
               return "something went wrong";
           }
        }

    }
}
