package pk.edu.niit.version_system.controller.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pk.edu.niit.version_system.entity.UserEntity.UserEntity;
import pk.edu.niit.version_system.service.UserService.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    // GET ALL USERS
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }


    // GET USER BY ID
    @GetMapping("/id/{id}")
    public UserEntity getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }


    // ADD USER
    @PostMapping
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }


    // UPDATE USER
    @PutMapping("/id/{id}")
    public UserEntity updateUser(
            @PathVariable String id,
            @RequestBody UserEntity user) {

        return userService.updateUser(id, user);
    }


    // DELETE USER
    @DeleteMapping("/id/{id}")
    public String deleteUser(@PathVariable String id) {

        return userService.deleteUser(id);
    }

}