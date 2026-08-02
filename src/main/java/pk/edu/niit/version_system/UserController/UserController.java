package pk.edu.niit.version_system.UserController;

import org.springframework.web.bind.annotation.*;
import pk.edu.niit.version_system.UserEntity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private Map<String, User> UserEnteries = new HashMap<>();
    @GetMapping
    public List<User> getAll()
    {
        return new ArrayList<>(UserEnteries.values());
    }

    @PostMapping
    public boolean createEntry (@RequestBody User entry)
    {
        UserEnteries.put(entry.getId(), entry);
        return true;
    }

    @DeleteMapping("id/{id}")
    public User deleteUserEntryByid(@PathVariable String id)
    {
        return UserEnteries.remove(id);
    }

    @PutMapping("id/{id}")
    public User updateUserEntryByid(@PathVariable String id, @RequestBody User entry)
    {
        return UserEnteries.put(id, entry);
    }

    @DeleteMapping("name/{name}")
    public User deleteUserEntryByname(@PathVariable String name)
    {
        return UserEnteries.remove(name);
    }

    @PutMapping("age/{age}")
    public User updateUserEntryByage(@PathVariable String age, @RequestBody User entry)
    {
        return UserEnteries.put(age, entry);
    }
    @GetMapping("id/{id}")
    public User getUserEntryByid(@PathVariable String id)
    {
        return UserEnteries.get(id);
    }

}
