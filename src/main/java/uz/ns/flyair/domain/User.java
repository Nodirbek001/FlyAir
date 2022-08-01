package uz.ns.flyair.domain;

import antlr.Utils;
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
    public User toDomain() {
        return User.builder()
                .username(this.username)
                .password(this.password)
                .role(Role.USER)
                .build();
    }

}
