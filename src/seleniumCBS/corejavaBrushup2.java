package seleniumCBS;

import java.util.ArrayList;

public class corejavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] cbs2 = {2, 4, 6, 8,9, 11, 20, 100, 101};
//		
//		//check if any arry has multiple of 2
//		 
//	  for(int i=0; i<cbs2.length; i++)
//	  {
//		 
		 
		   double[] numbers = {2.5, 9.0, 17.2, 5.0, 3.14};
		 
	        // 2. Access and Print
	        System.out.println("First element: " + numbers[0]);
	        System.out.println("Last element: " + numbers[numbers.length - 1]); 
	 
	        // 3. Reverse Order
	        System.out.println("Elements in reverse order: ");
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.println(numbers[i]);
	        }
	        
	        System.out.println("***************");
	        ArrayList<String> a = new ArrayList<String>();
	        a.add("channaveer");
	        a.add("shant");
	        a.add("shivu");
	        a.add("sachine");
	        a.add("psy");
	        System.out.println(a.get(3));
	        
	        for(int i=0; i<a.size(); i++)
	        {
	        	System.out.println(a.get(i));
	        }
	        System.out.println("***************");
	        
	        
	        for(String Val :a) 
	        {
	        	System.out.println(Val);
	        }
	        
	        // item present in the arraylist
	        System.out.println(a.contains("basav"));
	        // boolean result shows if we use contain method
	        
	        
	        
	        
	        }
	        
	        
	}


	       
	 
	