package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class Teacher{
	@GetMapping("/")
    public String home() {
        return "loginpage";
    }
@GetMapping("/welcome")
public String display()
{
	return "loginpage";
}
@GetMapping("/submit")
	public String submit(@RequestParam("username") String s1,@RequestParam("password") String s2,Model m)
	{
		if(s1.equals("praveenkumar") && s2.equals("12345"))
		{
			m.addAttribute("name","praveenkumar");
			m.addAttribute("imagePath","/images/praveen passport size photo 2025.JPG");
			m.addAttribute("resumePath","/ducuments/resume_praveenkumar_poleboyina (4).pdf");
			return "result";
		}
		else
		{
			m.addAttribute("error","invalid username or password");
			return "error";
		}
	}
}
