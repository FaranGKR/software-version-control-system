package pk.niit.edu.versions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserEntity
{
    private String name;
    @Id
    private String id;
    private int age;
    private int phonenumber;
}
