package com.example.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String openpage()
	{
		return "login";
	}
	
	@PostMapping("qwerty")
	public String checkLogin(Model model,User user)
	{
		String uname= user.getUsername();
		String pass=user.getPassword();
		System.out.println(uname + ""     +pass);
		
		if("TANUSHKA".equals(uname)&& "TANU@12".equals(pass))
		{
			model.addAttribute("msg","Welcome "+uname);
			return "home";
			
		}
		else
		{
			return "login";
		}
	}

}
