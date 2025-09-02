package JavaPractice.polymorphism.inheritance;

class A
{
 int a=100;
 
void display()
{
   System.out.println(a);	
}

}

class B extends A
{
  int b= 200;
  
  void show()
  {
	  System.out.println(b);
  }
}
 
class C extends B
{
 int c= 300;
  void print()
  {
 System.out.println(c);
}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		
	/*	B boobj = new B();
		System.out.println(boobj.a);
		System.out.println(boobj.b);
	}
 */
		C cobj = new C();
		cobj.a =100;
		cobj.c = 300;
		
	   cobj.print();
}
	}
