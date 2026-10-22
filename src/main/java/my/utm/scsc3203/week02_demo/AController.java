package my.utm.scsc3203.week02_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AController {
    
    @GetMapping("/aboutus")
    public String abc() {
        return "abc";
    }

     @GetMapping("/contactus")
    public String cba() {
        return "cba";
    }
}


