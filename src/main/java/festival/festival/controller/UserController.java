package festival.festival.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String userStart() {
        return "index";
    }
    @GetMapping("/contact")
    public String contactUser() {
        return "contact"; // This should map to contact.html in the templates folder
    }
}
