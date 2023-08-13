package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dao.UserDao;
import model.User;
import response.UserResponse;

public class UserService {

	private UserDao userDao;
	
	public UserService() {
		// TODO Auto-generated constructor stub
        this.userDao = new UserDao();
        // TODO Auto-generated constructor stub
    }
	
	public List<UserResponse> getUsers() {
		
		
		
		List<UserResponse> userResponsesList = new ArrayList<UserResponse>();
		
		List<User> userList = this.userDao.getUsers();
		
		for (User user : userList) {
			UserResponse userResponse = new UserResponse();
			userResponse.setDepartment(user.getDepartment());
			userResponse.setStudentId(user.getStudentId());
			userResponse.setMark(user.getMark());
			if (user.getMark() >= 40) {
				userResponse.setPass(1);
			} else {
				userResponse.setPass(0);
			}
			userResponsesList.add(userResponse);
		}
		
		return userResponsesList;
		
	}
	
	
	public String getUserName(String studentId) {
		
		List<User> userList = this.userDao.getUsers();
		
		String name = "";
		
		for (User user : userList) {
			if (studentId == user.getStudentId()) {
				name = user.getStudentName();
				break;
			}
		}
		
		return name;
		
	}
	
}
