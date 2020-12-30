package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by efilin on 30.12.2020.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreting() {
        return "Hello World";
    }
}
