package com.xworkz.ascertain.learn.rest;

import com.xworkz.ascertain.learn.dto.Userdto;
import com.xworkz.ascertain.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserRestcontroller {
    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(@RequestBody Userdto userDto){
        userService.createUser(userDto);
    }
    @GetMapping
    public void getAllUsers(){
        userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public void getUserById(@RequestBody Integer id){
        userService.getUserById(id);
    }
    @GetMapping("/delete/{id}")
    public void deleteUserById(@RequestBody Integer id){
        userService.deleteUserById(id);
    }



}
