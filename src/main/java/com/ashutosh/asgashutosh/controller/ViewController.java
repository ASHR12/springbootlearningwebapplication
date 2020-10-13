package com.ashutosh.asgashutosh.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping({"/","/accountcreation/login"})
    public String login(Model model) {
        return "login";
    }
    
    @GetMapping({"/accountcreation/home"})
    public String home(Model model,HttpSession session) {
    	if(session.getAttribute("username")!=null) {
    	 String username= session.getAttribute("username").toString();
    	 model.addAttribute("username", username);
    	}
        return "home";
    }
    @GetMapping({"/accountcreation/accountcheck"})
    public String account(Model model,HttpSession session) {
    	if(session.getAttribute("username")!=null) {
    	 String username= session.getAttribute("username").toString();
    	 model.addAttribute("username", username);
    	}
        return "accountcheck";
    }
    @GetMapping({"/accountcreation/enrolmentcheck"})
    public String enrolment(Model model,HttpSession session) {
    	if(session.getAttribute("username")!=null) {
    	 String username= session.getAttribute("username").toString();
    	 model.addAttribute("username", username);
    	}
        return "enrolmentcheck";
    }
}
