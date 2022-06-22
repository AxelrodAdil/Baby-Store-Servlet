package kz.epam.babyStore.dao;

import kz.epam.babyStore.entity.Category;
import kz.epam.babyStore.exception.DaoException;

import java.util.Optional;

public interface CategoryDao extends Dao<Category> {

    Optional<Category> findByName(String name) throws DaoException;
}
