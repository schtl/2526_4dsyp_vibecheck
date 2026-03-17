package sc._260223_poswmcproject_vidbecheck.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer stars;
    private String comment;
    private LocalDateTime createdAt;

    // ManyToOne
    @ManyToOne
    @JsonBackReference
    @ToString.Exclude
    private Event event;
}
