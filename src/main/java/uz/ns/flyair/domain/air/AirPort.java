package uz.ns.flyair.domain.air;

import lombok.*;
import uz.ns.flyair.domain.User;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class AirPort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User director;
    @OneToMany
    private List<User> managers;
    @OneToMany
    private List<Plane> planes;


}
