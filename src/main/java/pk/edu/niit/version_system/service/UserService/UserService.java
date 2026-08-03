package pk.edu.niit.version_system.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pk.edu.niit.version_system.entity.UserEntity.UserEntity;
import pk.edu.niit.version_system.repository.UserRepository.UserRepository;

import java.util.List;


@Service
public class UserService {


    @Autowired
    private UserRepository userRepos;



    // CREATE
    public UserEntity addUser(UserEntity user) {

        return userRepos.save(user);
    }



    // READ ALL
    public List<UserEntity> getAllUsers() {

        return userRepos.findAll();
    }



    // READ BY ID
    public UserEntity getUserById(String id) {

        return userRepos.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));
    }



    // UPDATE
    public UserEntity updateUser(String id, UserEntity user) {


        UserEntity existingUser =
                userRepos.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException("User not found"));


        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setPhone_number(user.getPhone_number());


        return userRepos.save(existingUser);
    }



    // DELETE
    public String deleteUser(String id) {

        userRepos.deleteById(id);

        return "User deleted successfully";
    }

}