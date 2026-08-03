package pk.edu.niit.version_system.Controller;
import pk.edu.niit.version_system.Entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class UserController {
    private Map<String, User>  userentries= new HashMap<String, User>();
    @GetMapping
    public List<User> getAll()
    {
        return new ArrayList<>(userentries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody User user)
    {
        userentries.put(user.getId(),user);
        return true;
    }

    @DeleteMapping("id/{id}")
    public User deleteUserEntrybyId(@PathVariable String id)
    {
        return userentries.remove(id);

    }

    @PutMapping("id/{id}")
    public User updateUserEntryById(@PathVariable String id, @RequestBody User user)
    {
        return userentries.put(id,user);
    }

    @GetMapping("id/{id}")
    public User getUserbyId(@PathVariable String id)
    {
        return userentries.get(id);
    }

    @GetMapping("name/{studentname}")
    public List<User> getUsername(@PathVariable String studentname)
    {
        List<User> result=new ArrayList<>();
        for(User user: userentries.values())
        {
            if (user.getName().equalsIgnoreCase(studentname))
            {
                result.add(user);
            }

        }

            return result;
    }
    @GetMapping("age/{age}")
    public List<User> getUserbyAge(@PathVariable int age)
    {
        List<User> result=new ArrayList<>();
        for (User user: userentries.values())
        {
            if(user.getAge()==age)
            {
                result.add(user);
            }
        }
        return result;
    }
}
