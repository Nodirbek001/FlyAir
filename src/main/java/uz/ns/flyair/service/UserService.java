package uz.ns.flyair.service;

import uz.ns.flyair.dao.UserDao;

public class UserService extends Service<UserDao>{
    protected UserService(UserDao dao) {
        super(dao);
    }

}
