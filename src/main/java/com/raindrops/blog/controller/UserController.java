package com.raindrops.blog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raindrops.blog.entity.User;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	
	@GetMapping("/list")
	public List<User> getUserList(){
		return Arrays.asList(new User(1, "raindrops", "addr1", "man1"),new User(1, "raindrops", "addr1", "man1"));
	}
	
}
