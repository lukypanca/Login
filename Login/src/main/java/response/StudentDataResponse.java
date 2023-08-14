package response;

public class StudentDataResponse {
	
	private String studentId;
	private Integer mark;
//	private String department;
	
	public StudentDataResponse() {
    	this.studentId = studentId;
    	this.mark = mark;
//    	this.department = department;
    }
	
	public String getStudentId() {
    	return studentId;
    }
	
	public Integer getMark() {
    	return mark;
    }
	
//	public String getDepartment() {
//    	return department;
//    }
	
	public void setStudentId(String studentId) {
    	this.studentId = studentId;
    }
	
	public void setMark(Integer mark) {
    	this.mark = mark;
    }
	
//	public void setDepartment(String department) {
//    	this.department = department;
//    }

	public String toString() {
        return "StudentDataResponse{" +
                "studentId=" + studentId +
                ", mark='" + mark + '\'' +
                '}';
    }
}
