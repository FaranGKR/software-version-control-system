package pk.edu.niit.version_system.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pk.edu.niit.version_system.Entities.User;
import pk.edu.niit.version_system.Repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAll() {
        return userRepository.findAll();
    }


    public User createEntry(User user) {
        return userRepository.save(user);
    }


    // DELETE USER BY ID
    public void deleteUserEntrybyId(int id) {
        userRepository.deleteById(id);
    }


    // UPDATE USER
    public User updateUserEntryById(int id, User user) {

        Optional<User> existingUser = userRepository.findById(id);

        if(existingUser.isPresent()) {

            User oldUser = existingUser.get();

            oldUser.setName(user.getName());
            oldUser.setAge(user.getAge());
            oldUser.setPhone_no(user.getPhone_no());
            oldUser.setEmail(user.getEmail());

            return userRepository.save(oldUser);
        }

        return null;
    }


    public User getUserbyId(int id) {

        Optional<User> user = userRepository.findById(id);

        return user.orElse(null);
    }

}