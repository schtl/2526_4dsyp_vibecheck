package sc._260223_poswmcproject_vidbecheck.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;

    private String title;
    private String location;
    private LocalDate eventDate;
    private String imageUrl;

    @JsonIgnore
    private List<String> artists;

    @OneToMany(
            mappedBy = "event",
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JsonManagedReference
    private List<Rating> ratings;
}
