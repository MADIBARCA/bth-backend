package kz.bbarss.hrhelper.controller;

import kz.bbarss.hrhelper.db.entity.User;
import kz.bbarss.hrhelper.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping("/users/type/{type}")
    public List<User> getUserByType(@PathVariable String type) {
        return userRepository.findByType(type);
    }

    @GetMapping("/users/tagIds")
    public List<User> getUserByTagIds(@RequestBody List<String> tagIds) {
        return userRepository.findByTagIdsIn(tagIds);
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id) {
        return userRepository.findById(id).orElse(null);
    }
}
