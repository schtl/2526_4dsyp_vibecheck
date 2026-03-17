package sc._260223_poswmcproject_vidbecheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sc._260223_poswmcproject_vidbecheck.pojo.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
