package oops;

public class TestBank {

	public static void main(String[] args) {

		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
		ICICI icici = new ICICI();
		System.out.println(icici.rateOfInterest());

		System.out.println("Polymorphism");

		Bank bank;// Reference variable of Bank
		bank = new SBI();
		// Reference variable of parent class refres to object of child class
		System.out.println(bank.rateOfInterest());
		bank = new ICICI();
		System.out.println(bank.rateOfInterest());
		bank = new Bank();
		System.out.println(bank.rateOfInterest());

	}
}
