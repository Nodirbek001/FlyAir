package uz.ns.flyair.domain;

import lombok.*;
import uz.ns.flyair.Dto.UserDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Role role;


    public enum Role {
        DIRECTOR, MANAGER, USER;
    }

    public static User toDomain(UserDto dto) {
        return null;
    }
}
