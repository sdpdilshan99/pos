package com.pos.dao;
import com.pos.entity.SuperEntity;

import java.sql.SQLException;
import java.util.List;


public interface CrudDao<T extends SuperEntity, ID> extends SuperDao{
    public boolean create(T t) throws SQLException, ClassNotFoundException;
    public boolean update(T t) throws SQLException, ClassNotFoundException;
    public boolean delete(ID id) throws SQLException, ClassNotFoundException;
    public T get(ID id) throws SQLException, ClassNotFoundException;
    public List<T> findAll() throws SQLException, ClassNotFoundException;
}
