package kz.epam.babyStore.service;

import kz.epam.babyStore.entity.Category;
import kz.epam.babyStore.exception.ServiceException;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> retrieveCategories() throws ServiceException;

    Optional<Category> retrieveCategoryById(long categoryId) throws ServiceException;
}
