package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserInterface;

@RestController
public class UserController {

	@Autowired
	UserInterface userService;
	User u = new User();

	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers() {
		List<User> list = userService.listUsers();
		return list;

	}

	@PostMapping("/add-users")
	@ResponseBody
	public void saveUser(@RequestBody User u) {

		 userService.saveUser(u);


	}
	@GetMapping("/Edit-users")
	@ResponseBody
	public void EditUser() {
		u=userService.findById((long) 2);
		u.setEtat("modif");
		u.setLastName("look");


		 userService.saveUser(u);


	}
	@GetMapping("/rmv-users")
	@ResponseBody
	public void rmvUser() {
		userService.removeById((long) 2);
	}

	@GetMapping("/find-user")
	@ResponseBody
	public User finduser() {
		return userService.findById((long) 2);
	}
}
