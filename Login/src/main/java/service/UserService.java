package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import dao.UserDao;
import model.User;
import response.StudentDataResponse;
import response.UserResponse;

public class UserService {

	private static final Logger logger = Logger.getLogger(UserService.class.getName());
	
	private UserDao userDao;
	
	public UserService() {
		// TODO Auto-generated constructor stub
        this.userDao = new UserDao();
        // TODO Auto-generated constructor stub
    }
	
	public List<UserResponse> getUsers() {
		
		List<UserResponse> userResponsesList = new ArrayList<UserResponse>();
		List<StudentDataResponse> studentDataList = new ArrayList<StudentDataResponse>();
		
		List<User> userList = this.userDao.getUsers();
		String department= "";
		for (int i = 0; i < userList.size(); i++) {
			StudentDataResponse studentDataResponse = new StudentDataResponse();
			UserResponse userResponse = new UserResponse();
			if (i == 0) {
				department = userList.get(i).getDepartment();
			}
			if (i > 0 && !userList.get(i).getDepartment().equalsIgnoreCase(department)) {
				userResponse.setData(new ArrayList<>(studentDataList));
				userResponse.setDepartment(department);
				userResponse.setPass(getPass(studentDataList));
				userResponsesList.add(userResponse);
				studentDataList.clear();
				department = userList.get(i).getDepartment();
			}

			studentDataResponse.setStudentId(userList.get(i).getStudentId());
			studentDataResponse.setMark(userList.get(i).getMark());
			studentDataList.add(studentDataResponse);
			if (i == (userList.size()-1)) {
				userResponse.setData(studentDataList);
				userResponse.setDepartment(department);
				userResponse.setPass(getPass(studentDataList));
				userResponsesList.add(userResponse);
			}

		}
		logger.info("Data List = " + userResponsesList);
		return userResponsesList;
		
	}
	
	private double getPass(List<StudentDataResponse> students) {
		int noOfPass = 0;
		for (StudentDataResponse student : students) {
			if (student.getMark() >= 40) {
				noOfPass++;
			}
		}
		double pass = (double) noOfPass/students.size()*100;
		logger.info("nilai pass = " + pass);
		return pass;
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
