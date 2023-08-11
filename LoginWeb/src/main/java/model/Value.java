package model;

import java.util.List;

public class Value {
    private String[] department = {"Dep 1", "Dep 1", "Dep 1", "Dep 1", "Dep 2", "Dep 3", "Dep 3", "Dep 3"};
    private String[] studentId = {"S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8"};
    private long[] mark = {35, 70, 60, 90, 30, 32, 70, 20};
    
    public Value() {
    	this.department = department;
    	this.studentId = studentId;
    	this.mark = mark;
    }
    
    
    public String[] getDepartment() {
    	return department;
    }
    
    public String[] getStudentId() {
    	return studentId;
    }
    
    public long[] getMark() {
    	return mark;
    }

    
}