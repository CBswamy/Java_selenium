package seleniumCBS;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a string objects
		String cs =  " a b c  d";
		String[]  splitline  = cs.split("c");
		     System.out.println(splitline[0]);
		     
		     for(int i=0; i<cs.length(); i++)
		     {
		    	 System.out.println(cs.charAt(i));
		     }
		     
		     System.out.println("********");
		     
		     for(int i=cs.length()-1; i>=0; i--)
		     {
		    	 System.out.println(cs.charAt(i));
		     }
		     }
	}


