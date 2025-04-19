package edu.icet.controller;

import edu.icet.dto.User;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class CustomerController {

    final UserService service;

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @GetMapping("/get-by-id/{id}")
    public User getById(@PathVariable Integer id){
        return service.getUserById(id);
    }

    @GetMapping("/get-by-name/{name}")
    public User getByName(@PathVariable String name){
        return  service.getUserByName(name);
    }

    @GetMapping("/get-all")
    public List<User> getAll(){
        return service.getaAll();
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User user){
        service.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        service.deleteUser(id);
    }
}
