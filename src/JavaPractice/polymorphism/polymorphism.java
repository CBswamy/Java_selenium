package JavaPractice.polymorphism;

public class  polymorphism {
 // onething have many forms
	
//	one thing have many forms called as overloading
	/* over loading 4 rules
	1. methods names should be same
	2. number of parameter should be different
	3. data type parameters should be different
	4. order of parameters should be different
	*/
	
	int a = 10;
	int b = 20;
	
	void sum()
	{
		System.out.println(a+b);  //1
	}
	
	void sum(int x, int y)   // Definition
	{
	System.out.println(x+y); //2  implementation
	}
	
	void sum(int x, double y)
	{
	System.out.println(x+y); //3
	}
	
	void cbs(double x, int y)
	{
	System.out.println(x+y); //4
	}
	
	
	
}
