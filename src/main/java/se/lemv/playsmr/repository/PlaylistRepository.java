package se.lemv.playsmr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import se.lemv.playsmr.model.Playlist;

@RepositoryRestController
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
