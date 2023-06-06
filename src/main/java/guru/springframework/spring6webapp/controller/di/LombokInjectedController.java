package guru.springframework.spring6webapp.controller.di;


import lombok.RequiredArgsConstructor;
import guru.springframework.spring6webapp.service.di.GreetingService;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class LombokInjectedController {

    private final GreetingService service;

    public String sayHello() {
        return service.sayGreeting();
    }

}
