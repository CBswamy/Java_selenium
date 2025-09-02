package JavaPractice.polymorphism.inheritance;

class Parent
{
  void display(int a)
  {
	  System.out.println(a);
  }
}

class child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);	
	}
}

class child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);	
	
}
}


public class HirarchyInheritance {

	public static void main(String[] args) {
		child1 C1 = new child1();
		C1.display(100);
		C1.show(200);
		
		child2 C2 =new child2();
		C2.display(121);
		C2.print(222);

	}

}
