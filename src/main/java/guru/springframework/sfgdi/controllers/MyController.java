package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by efilin on 30.12.2020.
 */
@Controller
public class MyController {

    public  String sayHello(){
        System.out.println("Hello world!!!");

        return "Hi folks!";
    }
}
