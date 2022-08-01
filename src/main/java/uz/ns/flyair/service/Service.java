package uz.ns.flyair.service;

public abstract class Service<T> {
    protected final T dao;

    protected Service(T dao) {
        this.dao = dao;
    }
}
