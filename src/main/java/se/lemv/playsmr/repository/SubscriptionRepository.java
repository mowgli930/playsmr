package se.lemv.playsmr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lemv.playsmr.model.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
