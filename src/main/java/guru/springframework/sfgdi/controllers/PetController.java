package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by efilin on 30.12.2020.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
