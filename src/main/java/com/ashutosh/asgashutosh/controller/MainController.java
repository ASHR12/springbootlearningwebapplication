package com.ashutosh.asgashutosh.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ashutosh.asgashutosh.model.Accounts;
import com.ashutosh.asgashutosh.model.AdminUser;
import com.ashutosh.asgashutosh.service.AccountService;
import com.ashutosh.asgashutosh.util.Response;


@RestController
public class MainController 
{
	@Autowired
	AccountService accountService;
	
	
	@RequestMapping(value="/checkAuth",method = RequestMethod.POST , produces = "application/json")
	ResponseEntity<?> login(@RequestBody AdminUser adminUser ,HttpSession session) {
		String username= adminUser.getAdminuserid();
		String pwd= adminUser.getAdminpwd();
		Response response = new Response();
		if(username.equals("testuser") && pwd.equals("testuser123")) {
			response.setMsg("login success");
			session.setAttribute("username", username);
		}else {
			response.setMsg("login fail");
			session.setAttribute("username", "null");
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value="/createAccount",method = RequestMethod.POST , produces = "application/json")
	ResponseEntity<?> accountCreation(@RequestBody Accounts accounts ) {
		accountService.saveOrUpdate(accounts);
		Response response = new Response();
		response.setMsg("Saved success");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
