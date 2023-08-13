package model;

public class User {
	
	private String studentId;
	private String studentName;
    private String department;
    private Integer mark;
//    private long pass;
    
    //Constructor
    public User(String studentId, String studentName, String department, Integer mark) {
    	this.studentId = studentId;
    	this.studentName = studentName;
    	this.department = department;
    	this.mark = mark;
//    	this.pass = pass;
    }
    
    //Getter
    public String getStudentId() {
    	return studentId;
    }
    
    public String getStudentName() {
    	return studentName;
    }
    
    public String getDepartment() {
    	return department;
    }
    
    public Integer getMark() {
    	return mark;
    }
    
//    public long getPass() {
//    	return pass;
//    }
    
    //Setter
    public void setStudentId(String studentId) {
    	this.studentId = studentId;
    }
    
    public void setStudentName(String studentName) {
    	this.studentName = studentName;
    }
    
    public void setDepartment(String department) {
    	this.department = department;
    }
    
    public void setMark(Integer mark) {
    	this.mark = mark;
    }
    
//    public void setPass(long pass) {
//    	this.pass = pass;
//    }
	
}
