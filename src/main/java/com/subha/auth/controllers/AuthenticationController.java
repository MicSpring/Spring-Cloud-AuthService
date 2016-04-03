package com.subha.auth.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
public class AuthenticationController {
	
	@Value("${db.username}")
	String dbUser;
	
	@Value("${db.password}")
	String dbPwd;
	
	
	@RequestMapping("/login")
	@ResponseBody
	public String login()
	{
		return "Hurrahh!!! User Logged In....";
	}

	//@HystrixCommand(fallbackMethod="loginUserFallback")
	@RequestMapping("/loginUser")
	@ResponseBody
	public String loginUser(@RequestBody String user)
	{
		System.out.println("USERNAME:"+dbUser+"\n\n PASSWORD:"+dbPwd);
		return "Hurrahh!!! "+user+" Logged In....";
	}
	
	
	public String loginUserFallback( String user)
	{
		System.out.println("USERNAME:"+dbUser+"\n\n PASSWORD:"+dbPwd);
		return "Ooops!!! "+user+" is in FallBack....";
	}

}
