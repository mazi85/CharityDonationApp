package pl.mazi85.charity.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "institutions")
@Entity
@Setter @Getter @ToString(exclude = "id") @EqualsAndHashCode(of ="id")
@NoArgsConstructor

public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

}
