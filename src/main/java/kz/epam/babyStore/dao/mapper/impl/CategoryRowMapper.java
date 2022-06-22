package kz.epam.babyStore.dao.mapper.impl;

import kz.epam.babyStore.dao.mapper.Column;
import kz.epam.babyStore.dao.mapper.RowMapper;
import kz.epam.babyStore.entity.Category;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper<Category> {

    @Override
    public Category map(ResultSet resultSet) throws SQLException {
        Category category = new Category();
        category.setCategoryId(resultSet.getLong(Column.CATEGORY_ID));
        category.setCategoryName(resultSet.getString(Column.CATEGORY_NAME));
        return category;
    }
}
