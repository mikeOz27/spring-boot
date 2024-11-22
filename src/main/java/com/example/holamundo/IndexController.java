package com.example.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({"/index.*", "/"})
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/about.*")
    public String about(Model model) {
        return "about";
    }

    @GetMapping("/service.*")
    public String service(Model model) {
        return "service";
    }

    @GetMapping("/contact.*")
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping("/gallery.*")
    public String gallery(Model model) {
        return "gallery";
    }

    @GetMapping("/testimonial.*")
    public String testimonial(Model model) {
        return "testimonial";
    }
}
