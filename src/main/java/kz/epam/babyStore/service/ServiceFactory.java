package kz.epam.babyStore.service;

import kz.epam.babyStore.service.impl.CategoryServiceImpl;

public class ServiceFactory {

    private final CategoryService categoryService = new CategoryServiceImpl();

    private ServiceFactory() {
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public static ServiceFactory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        static final ServiceFactory INSTANCE = new ServiceFactory();
    }
}
