package com.epam.lab.ticket.manager.service;

import com.epam.lab.ticket.manager.entity.Person;
import com.epam.lab.ticket.manager.exception.ServiceException;

/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
public interface PersonService {
    Long addNewPerson(Person person) throws ServiceException;
    Person getById(Long idPerson);
    boolean delete(Long idPerson);
}
