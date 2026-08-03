package pk.edu.niit.version_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.edu.niit.version_system.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}