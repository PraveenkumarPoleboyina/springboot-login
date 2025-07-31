package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class Teacher {

    @GetMapping("/")
    public String home() {
        return "loginpage";  // loads templates/loginpage.html
    }

    @GetMapping("/submit")
    public String submit(
            @RequestParam("username") String s1,
            @RequestParam("password") String s2,
            Model m) {

        if (s1.equals("praveenkumar") && s2.equals("12345")) {
            m.addAttribute("name", "praveenkumar");
            m.addAttribute("imagePath", "/images/praveenpassportsizephoto(2).JPG");
            m.addAttribute("resumePath", "/documents/resume_praveenkumar_poleboyina(4).pdf");
            return "result";  // loads templates/result.html
        } else {
            m.addAttribute("error", "Invalid username or password");
            return "error";   // loads templates/error.html
        }
    }
}
