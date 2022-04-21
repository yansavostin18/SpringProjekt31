package com.wsiiz.spring.SpringProjekt3.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("title", "Glowna strona");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "O nas");
        return "about";
    }


}
