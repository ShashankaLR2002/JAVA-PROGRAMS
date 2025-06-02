package com.xworkz.ascertain.learn.service;

import com.xworkz.ascertain.learn.dto.Userdto;

import java.util.List;

public interface UserService {
    Userdto createUser(Userdto userDto);
    List<Userdto> getAllUsers();
    Userdto getUserById(Integer id);
    void deleteUserById(Integer id);
}

