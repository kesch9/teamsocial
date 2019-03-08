package teamsocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Guest {
    @RequestMapping(value = "/guest", method = RequestMethod.GET)
    public String guestRequest(){
        return "guest";
    }
}
