package JavaPractice;
import JavaPractice.polymorphism
public class studentMain {
	public static void main(String[] args) 
	{
		// 
//		studentclass stu = new studentclass();
		
	   // 1) store data using object reference variables
		/*stu.sid=101;
		stu.sname="vinod"; 
		stu.grad='A';
		stu.printStudentData();
		*/
		
	
		// 2) using method
//		stu.setStudentData(1, "aaa", 'A');
//		stu.printStudentData();
		
		//Using constructor
		studentclass stu = new studentclass(101, "bbb", 'B');	
		stu.printStudentData();
	}

}
