package org.miu.lab.lab10.eLibraryApp.src.main.java.com.example.elibrary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
    public String home() {
        return "home/index";
    }
}
