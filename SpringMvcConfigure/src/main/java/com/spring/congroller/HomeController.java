package com.spring.congroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")  
    public String display(Model model)  
    {  
		model.addAttribute("name", "Hello Spring MVC");
		
        return "index";  
    }  
	
	
	@RequestMapping("/about")  
    public String display()  
    {  
		
		
        return "about";  
    } 

}
