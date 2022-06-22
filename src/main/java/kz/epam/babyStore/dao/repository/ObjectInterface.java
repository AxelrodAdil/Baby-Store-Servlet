package kz.epam.babyStore.dao.repository;

import java.sql.SQLException;
import java.util.List;

public interface ObjectInterface<T> {

    void create(T t) throws SQLException;

    T findById(Long id) throws SQLException;

    List<T> findAll() throws SQLException;

    void update(T t) throws SQLException;
}
