package kz.epam.babyStore.dao;

import kz.epam.babyStore.dao.impl.CategoryDaoImpl;

public class DaoFactory {

    private final CategoryDaoImpl categoryDao = new CategoryDaoImpl();

    private DaoFactory() {
    }

    public CategoryDaoImpl getCategoryDao() {
        return categoryDao;
    }

    public static DaoFactory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        static final DaoFactory INSTANCE = new DaoFactory();
    }
}
