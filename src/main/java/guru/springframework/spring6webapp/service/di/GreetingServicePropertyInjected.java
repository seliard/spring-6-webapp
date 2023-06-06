package guru.springframework.spring6webapp.service.di;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Using property injection is not a great idea.";
    }
}
