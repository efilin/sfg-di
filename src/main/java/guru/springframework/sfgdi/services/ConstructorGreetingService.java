package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by efilin on 30.12.2020.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
