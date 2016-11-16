package org.nearsoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
