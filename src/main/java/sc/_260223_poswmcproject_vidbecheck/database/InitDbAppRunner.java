package sc._260223_poswmcproject_vidbecheck.database;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import sc._260223_poswmcproject_vidbecheck.pojo.Artist;
import sc._260223_poswmcproject_vidbecheck.pojo.Event;
import sc._260223_poswmcproject_vidbecheck.repository.ArtistRepository;
import sc._260223_poswmcproject_vidbecheck.repository.EventRepository;

import java.io.InputStream;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class InitDbAppRunner implements ApplicationRunner {

    private final ArtistRepository artistRepository;
    private final EventRepository eventRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("AppRunner starts working");
        // FILE -> JSON OBJECT
        InputStream inputStream = this.getClass().getResourceAsStream("/vibes_artists.json");
        ObjectMapper objectMapper = new ObjectMapper();

        List<Artist> artists = objectMapper
                .readerForListOf(Artist.class)
                .readValue(inputStream);

        log.info("Read {} Artists", artists.size());

        // JSON -> DATABASE
        artistRepository.saveAll(artists);

        // ################################
        // EVENTS
        // ################################
        objectMapper.registerModule(new JavaTimeModule());
        inputStream = this.getClass().getResourceAsStream("/vibes_events.json");
        List<Event> events = objectMapper
                .readerForListOf(Event.class)
                .readValue(inputStream);
        log.info("Read {} Events", events.size());

        eventRepository.saveAll(events);

    }

}
