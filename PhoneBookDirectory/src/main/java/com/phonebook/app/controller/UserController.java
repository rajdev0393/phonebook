package com.phonebook.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.app.model.UserInfo;
import com.phonebook.app.repository.UserInfoRepository;

@RestController
@RequestMapping("/app")
public class UserController {

	@Autowired
	private UserInfoRepository repository;

	@PostMapping("/createUser")
	public UserInfo createUser(@RequestBody UserInfo user) {
		return repository.save(user);
	}

	@GetMapping("/getAllUsers")
	public List<UserInfo> getAll() {
		return repository.findAll();
	}

	@PutMapping("/updateUser")
	public UserInfo update(@RequestBody UserInfo request) {
		return repository.saveAndFlush(request);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String delete(@PathVariable Integer id) {
		repository.deleteById(id);
		return "Deleted successfully";
	}

}
