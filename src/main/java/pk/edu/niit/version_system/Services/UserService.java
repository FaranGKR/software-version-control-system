package pk.edu.niit.version_system.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import pk.edu.niit.version_system.Entities.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserService {


    private Map<String, User> userentries = new HashMap<>();

    public List<User> getAll() {
        return new ArrayList<>(userentries.values());
    }

    public boolean createEntry( User user) {
        userentries.put(user.getId(), user);
        return true;
    }

    public User deleteUserEntrybyId( String id) {
        return userentries.remove(id);
    }

    public User updateUserEntryById( String id,  User user) {
        return userentries.put(id, user);
    }

    public User getUserbyId( String id) {
        return userentries.get(id);
    }

}