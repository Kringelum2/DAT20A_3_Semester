package dk.kea.controllers;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class TrashController {

    ArrayList<String> list = new ArrayList<>(){{add("Pride"); add("Sloth"); add("Greed"); add("Wrath"); add("Lust"); add("Envy"); add("Gluttony");}};


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

        try {
            return list.get(number-1);
        } catch(Exception e) {
            return "No more sins";
        }

    }

    @GetMapping ("/trash")
    public String throwTrash(@RequestParam(defaultValue = "Christian") String trash) {
        return trash;
    }

    @PostMapping("/rubbishbin")
    public String throwOutRubbish(@RequestBody String  rubbish) {
        System.out.println(rubbish);
        return "everything went well";
    }

}
