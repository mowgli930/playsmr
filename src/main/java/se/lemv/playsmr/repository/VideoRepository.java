package se.lemv.playsmr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import se.lemv.playsmr.model.Video;

@RepositoryRestController
public interface VideoRepository extends JpaRepository<Video, Long> {
}
