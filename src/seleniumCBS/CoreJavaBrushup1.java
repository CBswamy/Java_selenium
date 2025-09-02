package seleniumCBS;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num  = 10;
		char letter = 'r';
		System.out.println(num + " letter" + " " + letter);
		
		//Array's
		int[]  cbs = new  int[4];
		cbs[0] = 1;
		cbs[1]  = 3;
		cbs[2] = 4;
		cbs[3] = 5;
		
		int[] cbs2 = {2, 4, 6, 8};
		System.out.println(cbs2[2]);
		System.out.println(cbs[2]);
		
		// for loop example with array
		for (int i=0; i<cbs2.length; i++)
		{
		System.out.print(cbs2[i]+ " ");

}
		
	}

}
