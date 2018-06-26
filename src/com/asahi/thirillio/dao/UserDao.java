package com.asahi.thirillio.dao;

import com.asahi.thrillio.DataStore;
import com.asahi.thrillio.entities.User;

public class UserDao {
   public User[] getUsers() {
	   return DataStore.getUsers();
   }
}
