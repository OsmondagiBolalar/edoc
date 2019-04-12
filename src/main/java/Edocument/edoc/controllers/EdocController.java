package Edocument.edoc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EdocController {

    @GetMapping({"/", "/index.html"})
    public String indexGet() {
        return "index";
    }
}
