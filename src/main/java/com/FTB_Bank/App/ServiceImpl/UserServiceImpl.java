package com.FTB_Bank.App.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FTB_Bank.App.Entity.User;
import com.FTB_Bank.App.ExceptionHandling.ResourceNotFound;
import com.FTB_Bank.App.Repository.UserRepository;
import com.FTB_Bank.App.Service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUSer(User user) {
		User newEntity = userRepo.save(user);
		return newEntity;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> list = userRepo.findAll();
		return list;
	}

	@Override
	public User getUserById(long id) {
		User user = userRepo.findById(id).orElseThrow(
				() -> new ResourceNotFound("User", "id", id));
		userRepo.save(user);
		return user;
	}

	@Override
	public User updateUser(User user, long id) {
		User users = userRepo.findById(id).orElseThrow(
				() -> new ResourceNotFound("User", "id", id));
		
		
		users.setFirstName(user.getFirstName());
		users.setLastName(user.getLastName());
		users.setAddress(user.getAddress());
		
		User updatedUser = userRepo.save(user);
		return updatedUser;
	}

	@Override
	public void deleteUSer(long id) {
		User user = userRepo.findById(id).orElseThrow(
				() -> new ResourceNotFound("User", "id", id));
		
		userRepo.delete(user);
		
	}
}

















