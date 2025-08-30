package com.Biblioteca.org.Controller;

import com.Biblioteca.org.Model.User;
import com.Biblioteca.org.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public User findUser(@PathVariable Long id){
        return service.findUserById(id);
    }

    @GetMapping
    public List<User> findUsers(){
         return service.findUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return service.createUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(Long id){
        service.deleteUser(id);
    }
}
