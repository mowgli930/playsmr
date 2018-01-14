package se.lemv.playsmr.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.lemv.playsmr.model.User;

@RestController
public class LoginResource {

    @GetMapping
    public String login() {

        return "Hi";
    }

}
