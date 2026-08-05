package pk.edu.niit.version_system.repository.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import pk.edu.niit.version_system.entity.EmployeeEntity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {

}
