package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.User;

public class UserDao {
	
	public List<User> getUsers() {
		
		List<User> userList = Arrays.asList(
				new User("S1", "S1 Name", "Dep 1", 35),
				new User("S2", "S2 Name", "Dep 1", 70),
				new User("S3", "S3 Name", "Dep 1", 60),
				new User("S4", "S4 Name", "Dep 1", 90),
				new User("S5", "S5 Name", "Dep 2", 30),
				new User("S6", "S6 Name", "Dep 3", 32),
				new User("S7", "S7 Name", "Dep 3", 70),
				new User("S8", "S8 Name", "Dep 3", 20)); 
		
		return userList;
	}
	
}
