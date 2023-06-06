package guru.springframework.spring6webapp.service.di;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjector implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Slightly better, but still not ideal.";
    }
}
