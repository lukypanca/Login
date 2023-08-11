package model;
public class Data {
    private int id;
    private String department;
    private String studentId;
    private long mark;
    
    
    public Data(int id, String department, String studentId, long marks) {
    	this.id = id;
    	this.department = department;
    	this.studentId = studentId;
    	this.mark = mark;
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
}