package dk.kea.controllers;

import dk.kea.models.Character;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarioController {

    @GetMapping ("/supermario/character")
    public Character character() {
        return new Character("Toad");
    }

}
