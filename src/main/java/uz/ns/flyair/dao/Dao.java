package uz.ns.flyair.dao;

import java.util.List;

public interface Dao<T> {
    T create(T entity);

    void delet(Long id);

    List<T> findALl();

    T findOne(String username);
}
