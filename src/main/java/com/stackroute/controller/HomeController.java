package com.stackroute.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.model.User;
import com.stackroute.repository.UserRepository;
import com.stackroute.repository.UserRepositoryImpl;

@Controller
public class HomeController {
	
	ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("Spring-Beans.xml");
	private User usr = null;
	private UserRepository userRepo = (UserRepository)appCtx.getBean("userRepo");
	
	@RequestMapping("/")
	public String indexPage(ModelMap model) {
		model.addAttribute("name", "Admin");
		return "index";
	}
	
	@RequestMapping(value="/home/login")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/home/processlogin")
	public String processLogin(HttpServletRequest req, ModelMap model) {
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		
		if(uname.equals("admin") && pwd.equals("admin")) {
			model.addAttribute("username", uname);
			return "successlogin";
		}
		return "errorlogin";
	}
	
	@GetMapping("/home/register")
	public String registerPage(ModelMap model) {
		model.addAttribute("allUsers", userRepo);
		return "registerform";
	}
	
	@PostMapping("/home/processRegistration")
	public String processRegistrationForm(@RequestParam("uname") String uname, @RequestParam("city") String city,
			@RequestParam("code") String code, @RequestParam("pwd") String pwd) {
		usr = (User) appCtx.getBean("user");
		usr.setCode(Integer.parseInt(code));
		usr.setCity(city);
		usr.setPwd(pwd);
		usr.setUname(uname);
		
		userRepo.addUser(usr);
		
		for(User u : userRepo.getAllUsers()) {
			System.out.println(u);
		}
		
		return "redirect:/home/";
	}
	
}
