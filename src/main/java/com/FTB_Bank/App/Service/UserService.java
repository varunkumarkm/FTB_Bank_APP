package com.FTB_Bank.App.Service;

import java.util.List;

import com.FTB_Bank.App.Entity.User;

public interface UserService {

	public User createUSer(User user);

	public List<User> getAllUsers();

	public User getUserById(long id);

	public User updateUser(User user, long id);

	public void deleteUSer(long id);

}
