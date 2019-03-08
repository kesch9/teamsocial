package teamsocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
    @RequestMapping(name = "registration", method = RequestMethod.GET)
    public String regstrationRequest(){
        return "registration";
    }
}
