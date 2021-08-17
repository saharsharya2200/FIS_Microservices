package com.fis.userr.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.userr.bean.Userr;
import com.fis.userr.repository.UserrRepository;


@RestController
@RequestMapping("/users")
public class UserrController {

//	@Autowired
//	private AppUserDetailsService appUserDetailsService;
//
//	@GetMapping("/{username}")
//	public UserDetails findByUsername(@PathVariable String username) {
//		return appUserDetailsService.loadUserByUsername(username);
//	}

	@Autowired
	private UserrRepository userRepository;

	@GetMapping("/{username}")
	public Userr findByUsername(@PathVariable String username) {
		return userRepository.findByUsername(username);
	}

}
