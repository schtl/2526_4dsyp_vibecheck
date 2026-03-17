package sc._260223_poswmcproject_vidbecheck.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sc._260223_poswmcproject_vidbecheck.pojo.Artist;
import sc._260223_poswmcproject_vidbecheck.service.ArtistService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArtistsController {

    private final ArtistService service;

    @GetMapping("/api/artists")
    ResponseEntity< List<Artist> > getAll(){

        List<Artist> artists = service.getAll();
        return ResponseEntity.ok(artists);
    }

}
