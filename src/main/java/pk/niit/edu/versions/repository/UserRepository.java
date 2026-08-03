package pk.niit.edu.versions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pk.niit.edu.versions.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
