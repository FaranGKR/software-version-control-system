package pk.edu.niit.version_system.entity.UserEntity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@jakarta.persistence.Entity
public class UserEntity {

    @Id
    private String id;
    private String name;
    private int age;
    private Long phone_number;

}