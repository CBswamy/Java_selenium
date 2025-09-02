package JavaPractice.polymorphism;

public class Encapsulation {
     private int account_no;
     private String  name;
     private double money;
     
     
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

    
    /* void setAccount (int Accno)
     {
    	 account_no= Accno;   
    	 
    	 // this keyword uses whenever the class and local variable same
//    	 this.Accno= Accno;   
     }
	
     int getAccount()
     {
    	 return account_no;
     }
     */
     
     
     
}
