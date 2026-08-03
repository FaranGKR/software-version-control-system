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

    @GetMapping
    public List<UserEntity> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody UserEntity entry) {
        return userService.createEntry(entry);
    }

    @DeleteMapping("id/{id}")
    public UserEntity deleteUserEntryById(@PathVariable String id) {
        return userService.deleteUserEntryByid(id);
    }

    @PutMapping("id/{id}")
    public UserEntity updateUserEntryById(@PathVariable String id,
                                          @RequestBody UserEntity entry) {
        return userService.updateUserEntryByid(id, entry);
    }

}
