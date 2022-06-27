package pl.mazi85.charity.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter @Setter @ToString(exclude = "password") @EqualsAndHashCode(of = "id") @Builder
@NoArgsConstructor @AllArgsConstructor
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String password;
    private String role;


}
