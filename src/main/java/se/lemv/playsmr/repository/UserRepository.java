package se.lemv.playsmr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lemv.playsmr.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
