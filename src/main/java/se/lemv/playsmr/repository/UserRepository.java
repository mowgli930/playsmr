package se.lemv.playsmr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import se.lemv.playsmr.model.User;

@RepositoryRestController
public interface UserRepository extends JpaRepository<User, Long> {
}
