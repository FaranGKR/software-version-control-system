package pk.edu.niit.version_system.service.UserService;


import org.springframework.stereotype.Service;
import pk.edu.niit.version_system.entity.UserEntity.UserEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private Map<String, UserEntity> UserEnteries = new HashMap<>();

    public List<UserEntity> getAll()
    {
        return new ArrayList<>(UserEnteries.values());
    }

    public boolean createEntry (UserEntity entry)
    {
        UserEnteries.put(entry.getId(), entry);
        return true;
    }
    public UserEntity deleteUserEntryByid(String id)
    {
        return UserEnteries.remove(id);
    }

    public UserEntity updateUserEntryByid( String id, UserEntity entry)
    {
        return UserEnteries.put(id, entry);
    }

}