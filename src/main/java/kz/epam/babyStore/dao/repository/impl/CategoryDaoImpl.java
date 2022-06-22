package kz.epam.babyStore.dao.repository.impl;

import kz.epam.babyStore.dao.connection.ProxyConnection;
import kz.epam.babyStore.dao.repository.CategoryDAOInterface;
import kz.epam.babyStore.util.SqlQuery;
import kz.epam.babyStore.entity.Category;
import kz.epam.babyStore.util.constants.Column;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static kz.epam.babyStore.util.SqlQuery.connectionPool;

public class CategoryDaoImpl implements CategoryDAOInterface<Category> {

    private static final Logger logger = LogManager.getLogger(CategoryDaoImpl.class);

    @Override
    public void create(Category category) {
        try (ProxyConnection con = connectionPool.getConnection();
             PreparedStatement stmt = con.prepareStatement(SqlQuery.SAVE_CATEGORY_QUERY)) {
//            stmt.setLong(1, category.getCategoryId());
            stmt.setString(1, category.getCategoryName());
            int rowCounter = stmt.executeUpdate();
            if (rowCounter != 1) {
                throw new SQLException("Inserted " + rowCounter + " rows...");
            }
            connectionPool.releaseConnection(con);
        } catch (Exception e) {
            // @ErrorHandler - throw new ...
            // TODO connection close or release
            logger.error(e);
        }
    }

    @Override
    public Category findById(Long categoryId) {
        Category category = null;
        try (ProxyConnection con = connectionPool.getConnection();
             PreparedStatement stmt = con.prepareStatement(SqlQuery.FIND_ALL_CATEGORY_BY_ID_QUERY)) {
            stmt.setLong(1, categoryId);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                category.setCategoryId(resultSet.getLong(Column.CATEGORY_ID));
                category.setCategoryName(resultSet.getString(Column.CATEGORY_NAME));
            }
            connectionPool.releaseConnection(con);
        } catch (Exception e) {
            // @ErrorHandler - throw new ...
            logger.error(e);
        }
        return category;
    }

    @Override
    public List<Category> findAll() throws SQLException {
        List<Category> categoryList = new ArrayList<>();
        try (ProxyConnection con = connectionPool.getConnection();
             PreparedStatement stmt = con.prepareStatement(SqlQuery.FIND_ALL_CATEGORY_QUERY)) {
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Category category = new Category();
                category.setCategoryId(resultSet.getLong(Column.CATEGORY_ID));
                category.setCategoryName(resultSet.getString(Column.CATEGORY_NAME));
                categoryList.add(category);
            }
            connectionPool.releaseConnection(con);
        } catch (Exception e) {
            // @ErrorHandler - throw new ...
            logger.error(e);
        }
        return categoryList;
    }

    @Override
    public void update(Category category) throws SQLException {
        try (ProxyConnection con = connectionPool.getConnection();
             PreparedStatement stmt = con.prepareStatement(SqlQuery.UPDATE_CATEGORY_QUERY)) {
            stmt.setLong(1, category.getCategoryId());
            stmt.setString(2, category.getCategoryName());
            stmt.executeUpdate();
            connectionPool.releaseConnection(con);
        } catch (Exception e) {
            // @ErrorHandler - throw new ...
            logger.error(e);
        }
    }
}
