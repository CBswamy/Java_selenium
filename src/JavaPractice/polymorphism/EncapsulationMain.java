package JavaPractice.polymorphism;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation  Acc = new Encapsulation();
		
//		Acc.account_no = 101;
//		Acc.name = "Yash";
//		Acc.money = 1000323.5;
		
		Acc.setAccount_no(101);
		Acc.setName("cannu");
		Acc.setMoney(111.1);
		
		System.out.println(Acc.getAccount_no());
		System.out.println(Acc.getName());
		System.out.println(Acc.getMoney());
	}

}
