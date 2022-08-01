package uz.ns.flyair.domain.air;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Plane {
    private Long id;

}
