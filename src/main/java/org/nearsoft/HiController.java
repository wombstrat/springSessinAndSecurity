package org.nearsoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

import javax.servlet.http.HttpSession;

@Controller
public class HiController {


    @RequestMapping("/")
    public String index(HttpSession session) {
        StringBuilder sessionAtributes = new StringBuilder();

        Collections.list(session.getAttributeNames()).forEach(name -> {
            sessionAtributes.append(name).append(" - ").append(session.getAttribute(name)).append("\n");
        });

        session.setAttribute("XD", "XD");
        return "login";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


}
