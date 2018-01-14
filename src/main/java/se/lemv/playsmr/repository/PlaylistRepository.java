package se.lemv.playsmr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lemv.playsmr.model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
