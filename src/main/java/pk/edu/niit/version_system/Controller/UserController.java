package pk.edu.niit.version_system.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.niit.version_system.Entities.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pk.edu.niit.version_system.Services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public User createEntry(@RequestBody User user) {
        return userService.createEntry(user);
    }

    @DeleteMapping("id/{id}")
    public void deleteUser(@PathVariable int id) {
         userService.deleteUserEntrybyId(id);
    }

    @PutMapping("id/{id}")
    public User updateUserEntry(@PathVariable int id,
                                    @RequestBody User user) {
        return userService.updateUserEntryById(id, user);
    }

    @GetMapping("id/{id}")
    public User getUserbyId(@PathVariable int id) {
        return userService.getUserbyId(id);
    }
}
