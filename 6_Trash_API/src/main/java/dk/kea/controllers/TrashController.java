package dk.kea.controllers;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class TrashController {


    @GetMapping ("/")
    public String message() {
        return "Hello World";
    }

    @GetMapping("/clock")
    public String clock() {
        return LocalDateTime.now().toString();
    }

    @RequestMapping(value="/endppoint", method = RequestMethod.GET)
    public String requestMappingTypeEndpoint() {
        return "Endppoint with Request mapping annotation";
    }

    @GetMapping("/sin/{number}")
    public String sevenDeadlySins(@PathVariable int number) {
        switch (number) {
            case 1: return "Death";
            case 2: return "Sloth";
            case 3: return "Gluttony";
            case 4: return "Pride";
            case 5: return "Lust";
            case 6: return "Envy";
            case 7: return "Greed";
        }
        return "";
    }
    
    


}
