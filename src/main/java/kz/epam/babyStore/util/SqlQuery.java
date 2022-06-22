package kz.epam.babyStore.util;

import kz.epam.babyStore.dao.connection.ConnectionPool;
import kz.epam.babyStore.util.constants.Column;
import kz.epam.babyStore.util.constants.Table;

public class SqlQuery {

    public static final ConnectionPool connectionPool = ConnectionPool.getInstance();

    public static final String FIND_ALL_CATEGORY_QUERY = "SELECT * FROM " + Table.CATEGORY + ";";
    public static final String SAVE_CATEGORY_QUERY = "INSERT INTO " + Table.CATEGORY + " (category_name) VALUES (?);";
    public static final String FIND_ALL_CATEGORY_BY_NAME_QUERY = "SELECT * FROM " + Table.CATEGORY + " WHERE category_name=?;";
    public static final String
            FIND_ALL_CATEGORY_BY_ID_QUERY = "SELECT * FROM " + Table.CATEGORY + " WHERE " + Column.CATEGORY_NAME + "=?;";
    public static final String UPDATE_CATEGORY_QUERY = "UPDATE " + Table.CATEGORY +
            " SET category_id = ?, category_name = ? WHERE category_id = ?;";


}
