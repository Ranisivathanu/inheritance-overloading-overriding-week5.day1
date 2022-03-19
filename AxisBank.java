package week5.day1;

public class AxisBank extends Bankinfo {

	public void deposit() {
		super.deposit();   
		System.out.println("Final deposite amount :Rs 20000");
	}

public static void main(String[] args) {
	AxisBank details=new AxisBank();
	details.deposit();
	Bankinfo Query = new Bankinfo();
	Query.fixed();
	Query.saving();
	

}

}

