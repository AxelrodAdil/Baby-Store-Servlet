package kz.epam.babyStore.dao.mapper;

import kz.epam.babyStore.entity.Identifiable;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T extends Identifiable> {

    T map(ResultSet resultSet) throws SQLException;
}
