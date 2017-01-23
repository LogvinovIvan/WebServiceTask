package com.epam.lab.ticket.manager.dao;

import com.epam.lab.ticket.manager.exception.DaoException;

import java.io.Serializable;


public interface Dao<T,K extends Serializable> {
    T getById(K key) throws DaoException;
    K add(T persistenceObject) throws DaoException;
    boolean delete(K id) throws DaoException;
}
