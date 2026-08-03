package pk.edu.niit.version_system.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.niit.version_system.Entities.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pk.edu.niit.version_system.Services.UserService;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        log.info("GET/user -All Users found");
        return userService.getAll();
    }

    @PostMapping
    public User createEntry(@RequestBody User user) {
        log.info("POST/user - User created");
        return userService.createEntry(user);
    }

    @DeleteMapping("id/{id}")
    public void deleteUser(@PathVariable int id) {
        log.info("DELETE/user/id/{} - User deleted ",id);
         userService.deleteUserEntrybyId(id);
    }

    @PutMapping("id/{id}")
    public User updateUserEntry(@PathVariable int id,
                                    @RequestBody User user) {
        log.info("UPDATE/user/id/{} - User updated ",id);
        return userService.updateUserEntryById(id, user);
    }

    @GetMapping("id/{id}")
    public User getUserbyId(@PathVariable int id) {
        log.info("GET/user/id/{id} - User deleted ",id);
        return userService.getUserbyId(id);
    }
}
