package uz.ns.flyair.container;

import uz.ns.flyair.dao.UserDao;

public class ApplicationContex {
    private static UserDao userDao() {
        return new UserDao();
    }

    @SuppressWarnings("raw_types")
    public static <T> T getBean(Class<T> clazz) {
        return switch (clazz.getSimpleName()) {
            case "UserDao" -> (T) userDao();
            default -> throw new RuntimeException("Bean not found");
        };
    }
}
