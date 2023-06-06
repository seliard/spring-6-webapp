package guru.springframework.spring6webapp.controller.di;

import guru.springframework.spring6webapp.service.di.GreetingService;
import guru.springframework.spring6webapp.service.di.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class NoInjectionController {

    private final GreetingService greetingService;

    public NoInjectionController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return "Hello everyone!!!";
    }

}
