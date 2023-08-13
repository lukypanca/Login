package response;

public class UserResponse {

	
	private String studentId;
    private String department;
    private Integer mark;
    private int pass;
    
    //Constructor
    public UserResponse() {
    	this.studentId = studentId;
    	this.department = department;
    	this.mark = mark;
    	this.pass = pass;
    }
    
    //Getter
    public String getStudentId() {
    	return studentId;
    }
    
    public String getDepartment() {
    	return department;
    }
    
    public Integer getMark() {
    	return mark;
    }
    
    public int getPass() {
    	return pass;
    }
    
    //Setter
    public void setStudentId(String studentId) {
    	this.studentId = studentId;
    }
    
    public void setDepartment(String department) {
    	this.department = department;
    }
    
    public void setMark(Integer mark) {
    	this.mark = mark;
    }
    
    public void setPass(int pass) {
    	this.pass = pass;
    }
    
}
