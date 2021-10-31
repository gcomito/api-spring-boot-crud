package com.codice.alpha.apispringbootcrud.controller;

import com.codice.alpha.apispringbootcrud.entity.User;
import com.codice.alpha.apispringbootcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.SaveUser(user);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }

    @PutMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }
}
