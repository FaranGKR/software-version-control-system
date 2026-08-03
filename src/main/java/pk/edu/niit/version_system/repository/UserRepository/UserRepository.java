package pk.edu.niit.version_system.repository.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import pk.edu.niit.version_system.entity.UserEntity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}