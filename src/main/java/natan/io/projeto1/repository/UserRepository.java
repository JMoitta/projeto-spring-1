package natan.io.projeto1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import natan.io.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query("SELECT u FROM User u WHERE u.name like %?1%")
	User findByQualquerCoisa(String name);
	
	List<User> findByEmail(String email);
	List<User> findByName(String name);
}
