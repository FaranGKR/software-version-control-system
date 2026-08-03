package pk.edu.niit.version_system.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class User {
    @Id
    private String id;
    private String studentname;
    private int age;
    private String phoneno;
    public String getName()
    {
        return studentname;
    }

}
