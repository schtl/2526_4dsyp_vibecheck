package sc._260223_poswmcproject_vidbecheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sc._260223_poswmcproject_vidbecheck.pojo.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
