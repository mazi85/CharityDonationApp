package pl.mazi85.charity.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Table(name = "donations")
@Entity
@Setter @Getter @ToString(exclude = "id") @EqualsAndHashCode(of ="id")

public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    @ManyToMany
    @JoinTable(name = "donations_categories",
            joinColumns = @JoinColumn(name = "donation_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;
    @ManyToOne
    @JoinColumn(name="institution_id")
    private Institution institution;
    private String street;
    private String city;
    private String zipCode;
    private String phoneNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;
    private boolean received;
    @Column(name = "created_on",updatable = false)
    private LocalDateTime createdOn;
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @PrePersist
    public void prePersist() {
        createdOn = LocalDateTime.now(Clock.systemUTC());
    }

    @PreUpdate
    public void preUpdate() {
        updatedOn = LocalDateTime.now(Clock.systemUTC());
    }
    @ManyToOne
    private User user;

}
