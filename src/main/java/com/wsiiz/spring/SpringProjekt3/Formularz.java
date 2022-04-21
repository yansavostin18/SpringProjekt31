package com.wsiiz.spring.SpringProjekt3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class Formularz {
    @RequestMapping("/formularz")
    public Object hello3(Model model) {
        Osoba osoba3 = new Osoba(1, "", "", "", "");
        model.addAttribute("osoba3", osoba3);
        return "formularz";
    }
}

