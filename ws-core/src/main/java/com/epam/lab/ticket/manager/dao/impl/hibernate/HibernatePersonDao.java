package com.epam.lab.ticket.manager.dao.impl.hibernate;

import com.epam.lab.ticket.manager.dao.PersonDao;
import com.epam.lab.ticket.manager.entity.Person;
import com.epam.lab.ticket.manager.exception.DaoException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernatePersonDao implements PersonDao {

    @Autowired
    private SessionFactory factory;
    public Person getById(Long key) throws DaoException {
        Session session = factory.getCurrentSession();
        Person person;
        try {
            person = (Person) session.get(Person.class, key);
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return person;
    }

    public Long add(Person perosn) throws DaoException {
        Session session = factory.getCurrentSession();
        Long idPerson;
        try {
            idPerson = (Long) session.save(perosn);
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return idPerson;
    }

    public boolean delete(Long id) throws DaoException {
        try {
            Session session = factory.getCurrentSession();
            Person person = new Person();
            person.setId(id);
            session.delete(person);
        }catch (HibernateException e){
            throw new DaoException ("Error delete person with id = " + id,e);
        }
        return true;
    }

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }
}
