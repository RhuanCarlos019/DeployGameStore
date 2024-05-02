package br.com.rhuan.gamestore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class indexController {
    
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
    @GetMapping("/home")
    public String getHome() {
        return "index";
    }
    

}