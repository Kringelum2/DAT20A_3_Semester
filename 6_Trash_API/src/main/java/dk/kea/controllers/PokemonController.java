package dk.kea.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PokemonController {

    private ArrayList<String> pokemonList = new ArrayList<>() {{
        add("Charmander");
        add("Mr.Sugesen AKA Christian");
        add("Squirtle");
        add("Bulbasaur");
    }};

    @GetMapping("/pokemon/go")
    public boolean pokemonGo() {
        return false;
    }

    @GetMapping("/pokemon")
    public ArrayList<String> pokemon() {
        return pokemonList;
    }

}
