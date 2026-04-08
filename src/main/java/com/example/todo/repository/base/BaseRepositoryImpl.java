package com.example.todo.repository.base;

import java.util.List;
import java.util.Optional;

public abstract class BaseRepositoryImpl<T, ID> implements IBaseRepository<T, ID> {
    @Override
    public T save(T entity) {

        return null;
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public void delete(ID id) {

    }
}
