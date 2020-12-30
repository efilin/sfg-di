package guru.springframework.sfgdi.services;

/**
 * Created by efilin on 30.12.2020.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreting() {
        return "Hello World";
    }
}
