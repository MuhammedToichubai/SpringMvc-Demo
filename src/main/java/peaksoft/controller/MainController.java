package peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/main")
public class MainController {


    @GetMapping
    public String mainPage(){
        return "main-page";
    }

    @GetMapping("/greetings")
    public String indexPage(){
        return "greetings";
    }
}
