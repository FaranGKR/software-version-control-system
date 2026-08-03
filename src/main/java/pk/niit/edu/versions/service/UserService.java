package pk.niit.edu.versions.service;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;
import pk.niit.edu.versions.entity.UserEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserService {
    private Map<String, UserEntity> userEntries = new HashMap<>();

    @GetMapping
    public List<UserEntity> getAll(){
        return new ArrayList<>(userEntries.values());
    }

    @PostMapping
    public boolean creatEntry(@RequestBody UserEntity entity){
        userEntries.put(entity.getId(),entity);
        return true;
    }

    @DeleteMapping("id/{id}")
    public UserEntity deleteByID(@PathVariable String id){
        return userEntries.remove(id);
    }

    @PutMapping("name/{name}")
    public UserEntity updatebyID(@PathVariable String name, @RequestBody UserEntity entity){
        return userEntries.put(name, entity);
    }


}
