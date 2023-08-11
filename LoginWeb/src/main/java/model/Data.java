package model;
public class Data {
    private int id;
    private String department;
    private String studentId;
    private long mark;
    private long pass;
    
    
    public Data() {
    	this.id = id;
    	this.department = department;
    	this.studentId = studentId;
    	this.mark = mark;
    	this.pass = pass;
    }
    
    // Getter Method
    public int getId() {
    	return id;
    }
    
    public String getDepartment() {
    	return department;
    }
    
    public String studentId() {
    	return studentId;
    }
    
    public long getMark() {
    	return mark;
    }
    
    public long getPass() {
    	return pass;
    }
    
    // Setter Method
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setDepartment(String department) {
    	this.department = department;
    }
    
    public void setStudentId(String studentId) {
    	this.studentId = studentId;
    }
    
    public void setMark(long mark) {
    	this.mark = mark;
    }
    
    public void setPass(long pass) {
    	this.pass = pass;
    }
}