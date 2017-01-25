package com.epam.lab.ticket.manager.dao.impl.hibernate;

import com.epam.lab.ticket.manager.dao.TicketDao;
import com.epam.lab.ticket.manager.entity.StateTicket;
import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class HibernateTicketDao implements TicketDao {

    private static final Logger logger = LogManager.getLogger(HibernateTicketDao.class);

    @Autowired
    private SessionFactory factory;

    @Override
    public boolean updateStatusOfTicket(Long idTicket) throws DaoException {
        boolean result = false;
        Session session = factory.getCurrentSession();
        try {

            Criteria criteria = session.createCriteria(Ticket.class);

            Criterion idCriterion = Restrictions.eq("ticketId",idTicket);
            Criterion statusCriterion = Restrictions.eq("state",StateTicket.BOOKED);


            criteria.add(Restrictions.and(idCriterion,statusCriterion));
            List<Ticket> tickets = criteria.list();
            if (tickets.size()!=0) {
                Ticket ticket = tickets.get(0);
                ticket.setState(StateTicket.BOUGHT);
                session.update(ticket);
                result = true;
            } else {
                logger.warn("Ticket with id= " + idTicket.toString() + " not found");
            }
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return result;
    }

    @Override
    public Ticket getById(Long key) throws DaoException {
        Session session = factory.getCurrentSession();
        Ticket ticket;
        try {
            ticket = (Ticket) session.get(Ticket.class, key);
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return ticket;
    }

    @Override
    public Long add(Ticket ticket) throws DaoException {
        Session session = factory.getCurrentSession();
        Long numberTicket;
        try {
            numberTicket = (Long) session.save(ticket);
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return numberTicket;
    }

    @Override
    public boolean delete(Long key) throws DaoException {
        boolean result;
        try {
            Session session = factory.getCurrentSession();
            Ticket ticket = (Ticket) session.get(Ticket.class, key);
            if (ticket != null) {
                session.delete(ticket);
                result = true;
            } else {
                logger.warn("Ticket with id " + key.toString() + "not found");
                result = false;
            }
        } catch (HibernateException e) {
            throw new DaoException("Error delete ticket with id = " + key, e);
        }
        return result;
    }

    @Autowired
    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }
}
