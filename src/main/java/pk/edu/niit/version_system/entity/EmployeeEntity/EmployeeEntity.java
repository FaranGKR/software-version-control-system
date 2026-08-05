package pk.edu.niit.version_system.entity.EmployeeEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="employee")
public class EmployeeEntity {
    @Id
    private String emp_id ;
    private String emp_name ;
    private String department ;
    private double salary ;
    private String email ;
}
