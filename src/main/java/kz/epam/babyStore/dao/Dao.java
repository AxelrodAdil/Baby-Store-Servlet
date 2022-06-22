package kz.epam.babyStore.dao;

import kz.epam.babyStore.exception.DaoException;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    List<T> findAll() throws DaoException;
    Optional<T> findById(Long id) throws DaoException;
    Long save(T item) throws DaoException;
    void removeById(Long id) throws DaoException;
}
