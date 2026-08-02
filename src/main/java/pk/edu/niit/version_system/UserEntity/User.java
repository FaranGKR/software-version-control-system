package pk.edu.niit.version_system.UserEntity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class User {

    @Id
    private String id;
    private String name;
    private int age;
    private int phoneNumber;

}