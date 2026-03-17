package sc._260223_poswmcproject_vidbecheck.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import sc._260223_poswmcproject_vidbecheck.pojo.Artist;
import sc._260223_poswmcproject_vidbecheck.repository.ArtistRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepository repository;

    public List<Artist> getAll(){
        return repository.findAll();
    }

}
