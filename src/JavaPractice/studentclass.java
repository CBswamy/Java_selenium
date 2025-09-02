package JavaPractice;

public class studentclass {
	
	int sid;
	String sname;
	char grad;
	
	void printStudentData()
	{
		System.out.println(sid+ "  "+sname+"  "+grad);		
	}
   // stored data in a variable from the object parameter and printing data in the main class
	void setStudentData(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;		
		
	}
	
	//constructor
	// constructor name should me same as a class name 
	// constructor will not required return/void value
	// constructor can also take parameter 
	// constructor only meant for to initialize data into variable, in method we can add the logics 
	studentclass(int id, String name, char gr) 
	{
		sid=id;
		sname=name;
		grad=gr;		
		
	}
	
}
