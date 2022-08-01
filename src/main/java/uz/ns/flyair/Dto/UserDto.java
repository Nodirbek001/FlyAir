package uz.ns.flyair.Dto;

import lombok.*;
import uz.ns.flyair.domain.User;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserDto {
    private String username;
    private String password;

    public User toDomain() {
        return User.builder()
                .username(this.username)
                .password(this.password)
                .build();
    }
}
