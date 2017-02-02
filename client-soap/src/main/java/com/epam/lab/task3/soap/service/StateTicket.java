
package com.epam.lab.task3.soap.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stateTicket.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stateTicket">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOUGHT"/>
 *     &lt;enumeration value="BOOKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stateTicket")
@XmlEnum
public enum StateTicket {

    BOUGHT,
    BOOKED;

    public String value() {
        return name();
    }

    public static StateTicket fromValue(String v) {
        return valueOf(v);
    }

}
