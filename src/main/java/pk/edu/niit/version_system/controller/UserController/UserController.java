package pk.edu.niit.version_system.controller.UserController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pk.edu.niit.version_system.entity.UserEntity.UserEntity;
import pk.edu.niit.version_system.service.UserService.UserService;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    // GET ALL USERS
    @GetMapping
    public List<UserEntity> getAllUsers() {
        try {
            log.info("Fetching all users...");
            return userService.getAllUsers();
        } catch (Exception e) {
            log.error("Error while fetching all users", e);
            throw e;
        }
    }

    @GetMapping("/id/{id}")
    public UserEntity getUserById(@PathVariable String id) {
        try {
            log.info("Fetching user with ID: {}", id);
            return userService.getUserById(id);
        } catch (Exception e) {
            log.error("Error while fetching user with ID: {}", id, e);
            throw e;
        }
    }

    @PostMapping
    public UserEntity addUser(@RequestBody UserEntity user) {
        try {
            log.info("Adding user with ID: {}", user.getId());
            return userService.addUser(user);
        } catch (Exception e) {
            log.error("Error while adding user", e);
            throw e;
        }
    }


    @PutMapping("/id/{id}")
    public UserEntity updateUser(
            @PathVariable String id,
            @RequestBody UserEntity user) {

        try {
            log.info("Updating user with ID: {}", id);
            return userService.updateUser(id, user);
        } catch (Exception e) {
            log.error("Error while updating user with ID: {}", id, e);
            throw e;
        }
    }


    @DeleteMapping("/id/{id}")
    public String deleteUser(@PathVariable String id) {

        try {
            log.info("Deleting user with ID: {}", id);
            return userService.deleteUser(id);
        } catch (Exception e) {
            log.error("Error while deleting user with ID: {}", id, e);
            throw e;
        }
    }

}