package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("This is saving account");

	}
	public void fixed() {
		System.out.println("This is fixed account");

	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}

}
