package JavaPractice;
import JavaPractice.polymorphism.polymorphism;
public class methods {

	void m1()
	{
		System.out.println("hello....");
	}
   
	//No parameter   Return Value
	
	String m2()
	{
		return("hello world m2");
	}
	
	//takes param no return value
	
	 void m3(String name)
	{
		System.out.println("hello...." + name);
		
	}
	 
	 // take param nad return value
	 
	 String  m4(String Nmae)
	 {
		 return("Hello..." + Nmae);
	 }
	 
	 
	 // how many ways we can store the variable data 



public static void main(String[]  args)

{
	polymorphism  aaa = new polymorphism(); 
    aaa.cbs(10.23, 10);
	
}
}