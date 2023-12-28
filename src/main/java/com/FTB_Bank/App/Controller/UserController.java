package com.FTB_Bank.App.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FTB_Bank.App.Entity.User;
import com.FTB_Bank.App.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<User> createUSer(@RequestBody User user) {
		return new ResponseEntity<User>(userService.createUSer(user), HttpStatus.OK);
	}
	
	@GetMapping("/getData")
	public List<User> getAllUsers(){
	    return userService.getAllUsers();  	
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<User> getUserById(@PathVariable long id) {
		return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUSer(@RequestBody User user, @PathVariable long id) {
		return new ResponseEntity<User>(userService.updateUser(user, id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String> deleteUSer(@PathVariable long id){
		userService.deleteUSer(id);
		return new ResponseEntity<String>("User will deleted successfully", HttpStatus.OK);	
	}
}
















