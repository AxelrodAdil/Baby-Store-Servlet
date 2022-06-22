package kz.epam.babyStore.service.impl;

import kz.epam.babyStore.dao.DaoFactory;
import kz.epam.babyStore.dao.impl.CategoryDaoImpl;
import kz.epam.babyStore.entity.Category;
import kz.epam.babyStore.exception.DaoException;
import kz.epam.babyStore.exception.ServiceException;
import kz.epam.babyStore.service.CategoryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public List<Category> retrieveCategories() throws ServiceException {
        try {
            CategoryDaoImpl categoryDao = DaoFactory.getInstance().getCategoryDao();
            return categoryDao.findAll();
        } catch (DaoException e) {
            logger.error("Unable to retrieve categories!");
            throw new ServiceException(e.getMessage(), e);
        }
    }

    @Override
    public Optional<Category> retrieveCategoryById(long categoryId) throws ServiceException {
        try {
            CategoryDaoImpl categoryDao = DaoFactory.getInstance().getCategoryDao();
            return categoryDao.findById(categoryId);
        } catch (DaoException e) {
            logger.error("Unable to retrieve category by id!");
            throw new ServiceException(e.getMessage(), e);
        }
    }
}
