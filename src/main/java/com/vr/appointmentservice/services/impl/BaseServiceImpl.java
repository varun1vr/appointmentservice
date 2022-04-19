package com.vr.appointmentservice.services.impl;

import com.vr.appointmentservice.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<T,E> implements BaseService<T, E> {

    @Autowired
    CrudRepository<E,T> repository;

    @Override
    public E create(E entity) {
        try{
           return repository.save(entity);
        } catch (Exception e) {
            System.out.println("Exception occurred ->" +e);
        }
        return null;
    }

    @Override
    public E getById(T t) {
       Optional<E> entity = null;
        try{
            entity = repository.findById(t);
        } catch (Exception e){
            System.out.println("Exception occurred ->" +e);
        }

        return entity.get();
    }

    @Override
    public E update(T type, E entity) {
        try{
           return repository.save(entity);
        } catch (Exception e){
            System.out.println("Exception occurred ->" +e);
        }
        return null;
    }

    @Override
    public Boolean delete(T t) {
        Boolean deleted = false;
        try{
            repository.deleteById(t);
            deleted = true;
        } catch (Exception e) {
            System.out.println("Exception occurred ->" +e);
        }
        return deleted;
    }

    @Override
    public List<E> getAll() {
        List<E> data = new ArrayList<>();
        Iterable<E> list = repository.findAll();
        list.forEach(x-> data.add(x));
        return data;
    }
}
