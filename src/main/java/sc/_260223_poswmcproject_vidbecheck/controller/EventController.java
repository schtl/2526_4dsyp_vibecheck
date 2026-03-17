package sc._260223_poswmcproject_vidbecheck.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sc._260223_poswmcproject_vidbecheck.pojo.Event;
import sc._260223_poswmcproject_vidbecheck.repository.EventRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EventController {
    private final EventRepository repository;

    @GetMapping("/api/events")
    ResponseEntity< List<Event> > getAll(){
        return ResponseEntity.ok(repository.findAll());
    }
}
