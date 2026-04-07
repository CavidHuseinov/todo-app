package com.example.todo.repository.base;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;

@NoRepositoryBean
public interface IBaseRepository<T,ID> extends Repository<T,ID> {
    T save(T entity);
    List<T> findAll();
    Optinal<T> findById (ID id);
    void Delete(ID id);
}
