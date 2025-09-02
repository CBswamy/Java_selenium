package JavaPractice;

public class mainclass {
	
	public static void main(String[] args)
	{
		OOPs emp1 = new OOPs();
		emp1.eid = 101;
		emp1.ename = "channu";
		emp1.sal = 30000;
		emp1.job = "QA";
		emp1.display();
		
		System.out.println("****");
		
		
		
	// methods calling practice
		methods cl= new methods();
		
		cl.m1();  //1
		
		String cl2 = cl.m2();   //2
		System.out.println(cl2);
		
		cl.m3("channu");   //3
		
		String cl3 = cl.m4("shantu");   //4
		System.out.println(cl3);

	}
}

