import com.epam.lab.ticket.manager.config.ApplicationConfig;
import com.epam.lab.ticket.manager.entity.Person;
import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.ServiceException;
import com.epam.lab.ticket.manager.service.PersonService;
import com.epam.lab.ticket.manager.service.TicketService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Ivan_Lohvinau on 1/24/2017.
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        PersonService service = applicationContext.getBean(PersonService.class);
        Person person = new Person();
        person.setName("Ivan");
        person.setSurname("Logvinov");
        person.setPatronymic("Sergeevich");

        person.setBirthDay(new Date());

        try {
            service.addNewPerson(person);
        } catch (ServiceException e) {
            System.out.printf(e.toString());
        }

    }
}
