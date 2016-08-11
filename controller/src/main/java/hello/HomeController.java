package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Manuel Perez P. (darkpriestrelative@gmail.com) on 10/08/16.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to the home page!";
    }
}
