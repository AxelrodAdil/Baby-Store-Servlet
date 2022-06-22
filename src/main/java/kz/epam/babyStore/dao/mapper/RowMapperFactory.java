package kz.epam.babyStore.dao.mapper;

import kz.epam.babyStore.dao.mapper.impl.CategoryRowMapper;
import kz.epam.babyStore.entity.Category;

public class RowMapperFactory {

    private final RowMapper<Category> categoryRowMapper = new CategoryRowMapper();

    public RowMapper<Category> getCategoryRowMapper() {
        return categoryRowMapper;
    }

    public static RowMapperFactory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final RowMapperFactory INSTANCE = new RowMapperFactory();
    }
}
