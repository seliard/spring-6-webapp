package guru.springframework.spring6webapp.service.profiles;

import guru.springframework.spring6webapp.service.di.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello!";
    }
}
