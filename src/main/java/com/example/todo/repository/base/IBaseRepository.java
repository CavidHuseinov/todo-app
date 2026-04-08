package com.example.todo.repository.base;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface IBaseRepository<T,ID> extends Repository<T,ID> {
    T save(T entity);
    List<T> findAll();
    Optional<T> findById (ID id);
    void delete(ID id);
}
