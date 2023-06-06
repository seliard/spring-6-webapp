package guru.springframework.spring6webapp.controller.di;

import guru.springframework.spring6webapp.service.di.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService service;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayGreeting();
    }
}
