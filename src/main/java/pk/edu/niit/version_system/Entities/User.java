package pk.edu.niit.version_system.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="User")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;

    private int age;
    @Column(name = "phone_no")
    private String phone_no;
    @Column(unique = true)
    private String email;


}
