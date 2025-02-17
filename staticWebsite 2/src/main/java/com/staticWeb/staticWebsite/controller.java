package com.staticWeb.staticWebsite;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    // For the index page
    @GetMapping("/index")
    public String index () {
        return "index";  // Thymeleaf looks for src/main/resources/templates/index.html
    }

    // For the details page
    @GetMapping("/details")
    public String details(Model model) {
        return "details";  // Thymeleaf looks for src/main/resources/templates/details.html
    }

    // For the about page
    @GetMapping("/about")
    public String about(Model model) {
        return "about";  // Thymeleaf looks for src/main/resources/templates/about.html
    }
}