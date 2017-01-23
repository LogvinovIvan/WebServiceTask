import com.epam.lab.task3.soap.service.TicketServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8089/wss/hello", new TicketServiceImpl());
    }
}
