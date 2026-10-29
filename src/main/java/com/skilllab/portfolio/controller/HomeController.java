
package com.skilllab.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Akriti yadav");
        model.addAttribute("title", "Java Backend Developer");
        model.addAttribute("tagline",
                "I build web applications with Java and Spring Boot - "
                + "and I'm looking for my first role as a backend developer.");
        model.addAttribute("about",
                "I'm a final-year BCA student at SHEAT College of "
                + "Engineering, Varanasi. I like building things that actually run, "
                + "and I've spent the last year learning Java and Spring Boot properly.");

        model.addAttribute("location", "Varanasi, India");
        model.addAttribute("email", "akritiyadav436@gmail.com");
        model.addAttribute("github", "https://github.com/akritii17");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/akriti-Yadav-831332442");
        model.addAttribute("resumeUrl", "https://drive.google.com/");

        return "index";
    }
}
