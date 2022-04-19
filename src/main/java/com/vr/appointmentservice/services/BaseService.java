package com.vr.appointmentservice.services;

import java.util.List;

public interface BaseService<T,E> {

    E create(E entity);

    E getById(T t);

    E update(T type, E entity);

    Boolean delete(T t);

    List<E> getAll();
}
