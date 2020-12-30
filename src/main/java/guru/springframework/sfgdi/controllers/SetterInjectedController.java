package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by efilin on 30.12.2020.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreting();
    }

}
