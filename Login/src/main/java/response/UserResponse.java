package response;

import java.util.List;

public class UserResponse {

	
	private List<StudentDataResponse> data;
    private String department;
    private double pass;
    
    //Constructor
    public UserResponse() {
    	this.data = data;
    	this.department = department;
    	this.pass = pass;
    }
    
    //Getter
    public List<StudentDataResponse> getStudentDataResponses() {
    	return data;
    }
    public String getDepartment() {
    	return department;
    }
    
    public double getPass() {
    	return pass;
    }
    
    //Setter
    public void setData(List<StudentDataResponse> data) {
    	this.data = data;
    }
    
    public void setDepartment(String department) {
    	this.department = department;
    }
    
    public void setPass(double pass) {
    	this.pass = pass;
    }
    
    public String toString() {
        return "UserResponse{" +
                "data=" + data +
                ", department='" + department + '\'' +
                ", pass=" + pass +
                '}';
    }
    
}
