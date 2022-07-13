package pl.mazi85.charity.model;

import lombok.*;

import javax.persistence.*;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tokens")
@Getter @Setter @EqualsAndHashCode(of = "id")
@NoArgsConstructor @Builder @AllArgsConstructor
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    @ManyToOne
    private User user;
    private LocalDateTime createdOn;

    @PrePersist
    public void prePersist() {
        createdOn = LocalDateTime.now(Clock.systemUTC());
    }


}
