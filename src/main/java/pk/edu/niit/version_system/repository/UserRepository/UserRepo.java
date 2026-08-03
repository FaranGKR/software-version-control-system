package pk.edu.niit.version_system.repository.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import pk.edu.niit.version_system.entity.UserEntity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, String> {

}
