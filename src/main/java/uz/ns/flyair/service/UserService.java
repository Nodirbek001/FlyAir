package uz.ns.flyair.service;

import lombok.NonNull;
import uz.ns.flyair.Dto.UserDto;
import uz.ns.flyair.dao.UserDao;
import uz.ns.flyair.domain.User;
import uz.ns.flyair.exception.BadRequestException;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

public class UserService extends Service<UserDao> {
    protected UserService(UserDao dao) {
        super(dao);
    }

    public void create(@NonNull UserDto dto) {
        if (Objects.isNull(dto.getPassword())) {
            throw new BadRequestException("Password can not be null");

        }
        if (Objects.isNull(dto.getUsername())) {
            throw new BadRequestException("username can not be null");
        }
        User user = dto.toDomain();
        dao.create(user);
    }
}
