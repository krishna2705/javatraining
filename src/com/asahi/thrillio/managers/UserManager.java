package com.asahi.thrillio.managers;

import com.asahi.thirillio.dao.UserDao;
import com.asahi.thrillio.entities.User;

public class UserManager {
	
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();
	//Create private constructor
	private UserManager() {}
	
	public static UserManager getInstance() {
		return instance;
	}
    
	public User createUser(long id,	String email, String password, String firstName, String lastName, int gender, String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
	
	public User[] getUsers() {
		return dao.getUsers();
	}
}
