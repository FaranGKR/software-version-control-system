package pk.gov.nastp.Project1.controller;

import org.springframework.web.bind.annotation.*;
import pk.gov.nastp.Project1.entity.UserEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private Map<String, UserEntity> userEntries = new HashMap<>();
    @GetMapping
    public List<UserEntity> getAll() {
        return new ArrayList<>(userEntries.values());
    }
    @PostMapping
    public boolean creatEntry(@RequestBody UserEntity entry) {
        userEntries.put(entry.getId(), entry);
        return true;
    }

    @DeleteMapping("id/{id}")
    public UserEntity deleteUserEntrybyId(@PathVariable String id) {
        return userEntries.remove(id);
    }

    @PutMapping("id/{id}")
    public UserEntity updateUserEntrybyId(@PathVariable String id, @RequestBody UserEntity entry) {
        return userEntries.put(id, entry);
    }
}
