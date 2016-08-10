package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Manuel Perez P. (darkpriestrelative@gmail.com) on 10/08/16.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Date date= new Date(System.currentTimeMillis());
        name = date.toLocalDate().getDayOfWeek().toString().toLowerCase();
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
