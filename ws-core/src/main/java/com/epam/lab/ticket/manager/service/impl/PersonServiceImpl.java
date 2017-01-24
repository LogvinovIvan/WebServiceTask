package com.epam.lab.ticket.manager.service.impl;

import com.epam.lab.ticket.manager.dao.PersonDao;
import com.epam.lab.ticket.manager.entity.Person;
import com.epam.lab.ticket.manager.exception.DaoException;
import com.epam.lab.ticket.manager.exception.ServiceException;
import com.epam.lab.ticket.manager.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDao dao;

    @Override
    public Long addNewPerson(Person person) throws ServiceException {
        Long id;
        try {
            id = dao.add(person);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return id;
    }

    @Override
    public Person getById(Long idPerson) {
        Person person;
        try {
            person = dao.getById(idPerson);
        } catch (DaoException e) {
            person = new Person();
        }
        return person;
    }

    @Override
    public boolean delete(Long idPerson) {
        boolean result;
        try {
            result = dao.delete(idPerson);
        } catch (DaoException e) {
            result = false;
        }
        return result;
    }


    public void setDao(PersonDao dao) {
        this.dao = dao;
    }
}
