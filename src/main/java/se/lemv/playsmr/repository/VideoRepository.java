package se.lemv.playsmr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lemv.playsmr.model.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
