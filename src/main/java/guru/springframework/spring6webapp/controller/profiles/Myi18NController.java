package guru.springframework.spring6webapp.controller.profiles;

import guru.springframework.spring6webapp.service.di.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {

    private final GreetingService service;

    public Myi18NController(@Qualifier("i18NService") GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayGreeting();
    }
}
