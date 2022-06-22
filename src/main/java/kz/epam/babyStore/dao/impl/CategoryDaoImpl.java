package kz.epam.babyStore.dao.impl;

import kz.epam.babyStore.dao.AbstractDao;
import kz.epam.babyStore.dao.CategoryDao;
import kz.epam.babyStore.dao.Table;
import kz.epam.babyStore.dao.mapper.RowMapperFactory;
import kz.epam.babyStore.entity.Category;
import kz.epam.babyStore.exception.DaoException;

import java.util.Optional;

public class CategoryDaoImpl extends AbstractDao<Category> implements CategoryDao {
    private static final String SAVE_CATEGORY_QUERY = "INSERT INTO " + Table.CATEGORY + " (category_name) VALUES (?)";
    private static final String FIND_CATEGORY_BY_NAME_QUERY = "SELECT * FROM " + Table.CATEGORY + " WHERE category_name=?";

    public CategoryDaoImpl() {
        super(RowMapperFactory.getInstance().getCategoryRowMapper(), Table.CATEGORY);
    }

    @Override
    public Long save(Category category) throws DaoException {
        return executeInsertQuery(SAVE_CATEGORY_QUERY, category.getCategoryName());
    }

    @Override
    public Optional<Category> findByName(String name) throws DaoException {
        return executeQueryForSingleResult(FIND_CATEGORY_BY_NAME_QUERY, name);
    }
}
