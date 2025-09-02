package JavaPractice.polymorphism;

public class ConstructorOverloading {
	double width, height, depth;
	
	
	ConstructorOverloading()
	{
		width=height=depth=10;
		
	}
	ConstructorOverloading(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
		
	}
	
	ConstructorOverloading(double len)
	{
		width=len;
		height=len;
		depth=len;
		
	}
	
	double volume()
	{
		return(width*height*depth);
	}
	
}
