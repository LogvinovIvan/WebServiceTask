package com.epam.lab.ticket.manager.exception;

/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
public class ServiceException extends Exception {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
