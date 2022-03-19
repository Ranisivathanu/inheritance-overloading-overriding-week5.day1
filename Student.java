package week5.day1;

public class Student  extends College {
	public void studentName() {
	     System.out.println("student Name: Sara");
}
	public void studentDept() {
    
		System.out.println("student department :EEE");
} 
	public void studentId() {
    
		System.out.println("student Id : 23014");
		
}
public static void main(String[] args) {
	Student detail=new Student();
	detail.studentName();
	detail.studentId();
	detail.studentDept();
	College category=new College();
	category.collegeName();
	category.collegeCode();
	category.collegeRank();
	Department list =new Department();
	list.deptName();
	
	
	
	
}	
}

