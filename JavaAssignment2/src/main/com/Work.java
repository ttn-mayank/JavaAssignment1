package main.com;

import bank.*;


public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbi = SBI.getInstance();
		Account sbi1 = new Account(843326385801,"sbi0066",Type.SAVINGS,"Mayank","Agra");
		sbi.registerAccount(sbi1);
		sbi.getDetails();
	}

}
